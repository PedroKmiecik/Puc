package programacaoorientada.trabalho7;

public abstract class Vilao extends Personagem{

	public void correr(float x, float y) {
		this.posicao_x = x;
		this.posicao_y = y;
		System.out.println(getClass().getSimpleName() + " Correndo.");
	}
	
}
