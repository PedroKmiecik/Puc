package programacaoorientada.trabalho5;

public class Principiante extends Jogador {
	
	private double bonus;
	
	public Principiante(String jogador, int score, double bonus) {
		super(jogador, score);
		this.bonus = bonus;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Bonus: " + bonus);
	}
	
	public void ganhar(int p) {
		score += p;
		bonus += p * 0.1;
	}
	
	public void perder(int p) {
		score -= p;
		bonus -= p * 0.1;
	}
	
}
