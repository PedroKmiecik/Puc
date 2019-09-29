package segurancadainformacao;

public class main {
	public static void main(String[] args) {
		String palavra = "Professor gente boa";
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char[] array = palavra.toUpperCase().toCharArray();
		char[] novaPalavra = new char[palavra.length()];
		int count = 0;
		for (char i : array) {
			if (i == ' ') {
				novaPalavra[count] = ' ';
			} else if (alfabeto.indexOf(array[count]+3) < 0) {
				int overflow = alfabeto.length()- alfabeto.indexOf(array[count]);
				novaPalavra[count] = alfabeto.charAt(overflow);
			} else {
				novaPalavra[count] = alfabeto.charAt(alfabeto.indexOf(array[count]) + 3);
			}
			count++;
		}
		System.out.println(novaPalavra);
	}
}
