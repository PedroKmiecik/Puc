package programacaoorientada.trabalho7;

public class Pinguim extends Ladrao {

	public void atirar() {
		System.out.println(getClass().getSimpleName() + " Atirando.");
	}

	public void correr(float x, float y) {
		super.correr(x, y);
	}

}
