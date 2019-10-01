package segurancadainformacao.kdc;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Usuario {
	private String nomeUsuario;
	private SecretKey chaveMestra;
	private SecretKey chaveSessao;
	private byte[] mensagemCifrada;

	public Usuario(String nome) throws NoSuchAlgorithmException {
		nomeUsuario = nome;
		chaveMestra = AES.gerarKey();
		KDC.colecaoChaves.add(chaveMestra);
		KDC.colecaoUsuario.add(this);
	}

	public void enviarMensagem(Usuario user, String mensagem) throws NoSuchAlgorithmException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException, InvalidKeyException, UnsupportedEncodingException {

		var sessaoCifrada = KDC.criarSessao(this, user);

		var chaveSessaoDecifrada = AES.decifra(sessaoCifrada[0], chaveMestra);

		var temp = AES.converter(chaveSessaoDecifrada);

		chaveSessao = AES.encodeKey(temp);

		mensagemCifrada = sessaoCifrada[1];
		user.setMensagemCifrada(mensagemCifrada);
		
		System.out.println(nomeUsuario + " sua chave de sessão é: " + temp);

	}

	public void receberMensagem() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			BadPaddingException, UnsupportedEncodingException, IllegalBlockSizeException {

		var chaveSessaoDecifrada = AES.decifra(mensagemCifrada, chaveMestra);

		var temp = AES.converter(chaveSessaoDecifrada);

		chaveSessao = AES.encodeKey(temp);
		
		System.out.println(nomeUsuario + " sua chave de sessão é: " + temp);

	}

	public void setMensagemCifrada(byte[] mensagemCifrada) {
		this.mensagemCifrada = mensagemCifrada;
	}

	public SecretKey getChaveMestra() {
		return chaveMestra;
	}

}
