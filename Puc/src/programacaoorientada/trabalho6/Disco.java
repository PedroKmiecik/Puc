package programacaoorientada.trabalho6;

import java.util.ArrayList;

public class Disco {

	private char nome;
	private ArrayList<String> pastas = new ArrayList();
	
	public Disco(char nome) {
		this.nome = nome;
	}
	
	public Pasta criar_pasta(String nome) {
		Pasta novaPasta = new Pasta(nome);
		pastas.add(nome);
		return novaPasta;
	}
	
	public void remover(String nome) {
		pastas.remove(nome);
	}
	
	public void listar() {
		System.out.println(pastas);
	}
	
}
