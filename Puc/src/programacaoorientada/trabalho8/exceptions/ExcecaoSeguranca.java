package programacaoorientada.trabalho8.exceptions;

public abstract class ExcecaoSeguranca extends Exception{

	public ExcecaoSeguranca() {
		super();
	}
	
	public ExcecaoSeguranca(String message) {
		super(message);
	}
	
}
