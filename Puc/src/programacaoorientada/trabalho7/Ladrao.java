package programacaoorientada.trabalho7;

public abstract class Ladrao extends Vilao{

	public void saltar(float z) {
		this.posicao_z = z;
		System.out.println(getClass().getSimpleName() + " Saltando.");
	}
	
}
