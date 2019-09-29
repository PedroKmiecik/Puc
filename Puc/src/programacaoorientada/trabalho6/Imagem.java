package programacaoorientada.trabalho6;

public class Imagem extends Arquivo{

	public Imagem(String nome) {
		super(nome);
	}
	
	public void abrir() {
		super.abrir((byte)(1));
	}

}
