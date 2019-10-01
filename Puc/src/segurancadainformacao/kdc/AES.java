package segurancadainformacao.kdc;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AES {
	private static String ALGORITMO = "AES";

	public static byte[] cifra(String texto, SecretKey chave) throws IllegalBlockSizeException, BadPaddingException,
			NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, InvalidKeyException {
		Cipher cifrador = Cipher.getInstance(ALGORITMO);
		cifrador.init(Cipher.ENCRYPT_MODE, chave);
		byte[] textoCifrado = cifrador.doFinal(texto.getBytes());
		return textoCifrado;
	}

	public static byte[] decifra(byte[] texto, SecretKey chave) throws IllegalBlockSizeException, BadPaddingException,
			NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, InvalidKeyException {
		Cipher decifrador = Cipher.getInstance(ALGORITMO);
		decifrador.init(Cipher.DECRYPT_MODE, chave);
		byte[] textoDecifrado = decifrador.doFinal(texto);
		return textoDecifrado;
	}

	public static SecretKey gerarKey() throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITMO);
		keyGen.init(256);
		return keyGen.generateKey();
	}

	public static String decodeKey(SecretKey secretKey) {
		String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
		return encodedKey;
	}

	public static SecretKey encodeKey(String secretKey) {
		byte[] decodedKey = Base64.getDecoder().decode(secretKey);
		SecretKey originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, ALGORITMO); 
		return originalKey;
	}

	public static String converter(byte[] textoConvertido) {
		return new String(textoConvertido);
	}
}
