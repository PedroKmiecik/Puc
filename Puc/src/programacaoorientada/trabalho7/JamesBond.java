package programacaoorientada.trabalho7;

public class JamesBond extends Heroi{

	public void atirar() {
		System.out.println(getClass().getSimpleName() + " Atirando.");
	}
	
	public void saltar(float z) {
		super.saltar(z);
	}
	
}
