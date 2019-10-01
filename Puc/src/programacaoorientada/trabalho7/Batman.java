package programacaoorientada.trabalho7;

public class Batman extends Heroi implements Camuflagem{

	public void atirar() {
		super.atirar();
	}

	public void camuflar(int cor) {
		super.cor = cor;
		System.out.println(getClass().getSimpleName() + " Camuflando.");
	}

	public void personificar(Heroi h) {
		
	}

}
