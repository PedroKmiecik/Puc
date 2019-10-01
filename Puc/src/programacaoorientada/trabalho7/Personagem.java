package programacaoorientada.trabalho7;

public abstract class Personagem {

	private boolean vivo;
	protected float posicao_x;
	protected float posicao_y;
	protected float posicao_z;
	protected int cor;
	
	public void correr(float x, float y) {
		this.posicao_x = x;
		this.posicao_y = y;
		System.out.println(getClass().getSimpleName() + " Correndo.");
	}
	
	public void saltar(float z) {
		this.posicao_z = z;
		System.out.println(getClass().getSimpleName() + " Saltando.");
	}
	
	public void atirar() {
		System.out.println(getClass().getSimpleName() + " Atirando.");
	}
	
	public void morrer() {
		this.vivo = false;
		System.out.println(getClass().getSimpleName() + " Morto.");
	}
	
}
