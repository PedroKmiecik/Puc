package programacaoorientada.trabalho5;

public class Jogador {
	
	private String nome;
	protected int score;
	
	public Jogador(String nome, int score) {
		this.nome = nome;
		this.score = score;
	}
	
	public void imprimir() {
		System.out.println("Jogador: " + nome);
		System.out.println("Score: " + score);
	}
	
}