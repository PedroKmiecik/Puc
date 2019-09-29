package programacaoorientada.trabalho5;

public class Senior extends Profissional {

	private double premio;
	
	public Senior(String jogador,int score, double capital, double premio) {
		super(jogador, score, capital);
		this.premio = premio;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Premio: " + premio);
	}
	
	public void ganhar(int p) {
		super.ganhar(p);
		premio += p * 2;
	}
	
	public void perder(int p) {
		super.perder(p);
		premio -= p * 0.5;
	}
	
}
