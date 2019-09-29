package programacaoorientada.trabalho6;

public class Som extends Arquivo{

	public Som(String nome) {
		super(nome);
	}
	
	public void abrir() {
		super.abrir((byte)(2));
	}

}
