package programacaoorientada.trabalho7;

public abstract class Heroi extends Personagem {

	public void correr(float x, float y) {
		this.posicao_x = x;
		this.posicao_y = y;
		System.out.println(getClass().getSimpleName() + " Correndo.");
	}

	public void saltar(float z) {
		this.posicao_z = z;
		System.out.println(getClass().getSimpleName() + " Saltando.");
	}

}
