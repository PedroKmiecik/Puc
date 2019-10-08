package programacaoorientada.trabalho7;

public class DrNo extends Terrorista{

	public void saltar(float z) {
		this.posicao_z = z;
		System.out.println(getClass().getSimpleName() + " Saltando.");
	}
	
	public void atirar() {
		super.atirar();
	}
	
	public void correr(float x, float y) {
		super.correr(x, y);
	}
	
}
