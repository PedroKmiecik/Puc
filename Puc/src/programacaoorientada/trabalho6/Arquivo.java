package programacaoorientada.trabalho6;

import java.util.Random;

public class Arquivo {

	private String nome;
  	private byte[] bytes = new byte[1];
	
	public Arquivo(String nome) {
		this.nome = nome;
		Random rd = new Random();
		rd.nextBytes(bytes);
		
	}
	
	public String getNome() {
		return nome;
	}
	
}
