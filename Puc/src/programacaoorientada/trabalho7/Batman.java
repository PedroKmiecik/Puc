package programacaoorientada.trabalho7;

public class Batman extends Heroi implements Camuflagem {

	public void atirar() {
		System.out.println(getClass().getSimpleName() + " Atirando.");
	}

	public void camuflar(int cor) {
		super.cor = cor;
		System.out.println(getClass().getSimpleName() + " Camuflando.");
	}

	public void personificar(Heroi h) {

	}

}
