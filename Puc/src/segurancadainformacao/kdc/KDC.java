package segurancadainformacao.kdc;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;


public class KDC {
	public static ArrayList<SecretKey> colecaoChaves = new ArrayList<SecretKey>();
	public static ArrayList<Usuario> colecaoUsuario = new ArrayList<Usuario>();
	private static SecretKey chaveSessao;

	public static void main(String[] args) throws  NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
		Usuario b = new Usuario("Bob");
		Usuario a = new Usuario("Alice");
		a.enviarMensagem(b, "Oi, tudo bem?");
		b.receberMensagem();
	}
	
	public static byte[][] criarSessao(Usuario a, Usuario b) throws NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, UnsupportedEncodingException {
		chaveSessao = AES.gerarKey();
		byte [] chaveSessaoA = AES.cifra(AES.decodeKey(chaveSessao), a.getChaveMestra());
		byte [] chaveSessaoB = AES.cifra(AES.decodeKey(chaveSessao), b.getChaveMestra());
		byte [][] chaveSessaoCifrada = {chaveSessaoA,chaveSessaoB};
		return chaveSessaoCifrada;
	}
}
