package programacaoorientada.trabalho6;

public class Planilha extends Arquivo{

	public Planilha(String nome) {
		super(nome);
	}
	
	public void abrir() {
		super.abrir((byte)(4));
	}

}
