package programacaoorientada.trabalho6;

public class Apresentacao extends Arquivo{

	public Apresentacao(String nome) {
		super(nome);
	}
	
	public void abrir() {
		super.abrir((byte)(5));
	}

}
