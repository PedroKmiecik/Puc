package programacaoorientada.trabalho8.exceptions;

public abstract class ExcecaoAutenticacao extends ExcecaoSeguranca{

	public ExcecaoAutenticacao() {
		super();
	}
	
	public ExcecaoAutenticacao(String message) {
		super(message);
	}
	
}
