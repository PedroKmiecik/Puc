package programacaoorientada.trabalho7;

public class Goldfinger extends Terrorista implements Personificacao{

	private Heroi heroi;
	
	public void saltar(float z) {
		super.saltar(z);
	}
	
	public void camuflar(int cor) {
		super.cor = cor;
		System.out.println(getClass().getSimpleName() + " Camunflando.");
	}

	public void personificar(Heroi h) {
		this.heroi = h;
		System.out.println("Personificando: " + heroi.getClass().getSimpleName());
	}
	
}
