package programacaoorientada.trabalho8.banco;

public class Main {

	public static void main(String[] args) {

		Banco itau = new Banco("Itau");

		itau.criar_conta(1, "minha senha", 900.0);
		itau.criar_conta(2, "minha senha", 500.0);
		itau.criar_conta(3, "minha senha", 800.0);
		itau.criar_conta(4, "minha senha", 400.0);
		itau.criar_conta(5, "minha senha", 100.0);

		try {

			itau.setHorario(13.00);

			itau.sacar(1, "minha senha", 900.0);
			itau.sacar(2, "minha senha", 100.0);
			itau.sacar(3, "minha senha", 400.0);
			itau.sacar(4, "minha senha", 200.0);
			itau.sacar(5, "minha senha", 50.0);

			itau.sacar(1, "minha senha", 100.0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {

			itau.sacar(2, "minhasenha", 100.0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {

			itau.sacar(7, "minha senha", 400.0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {

			itau.setHorario(23.00);

			itau.sacar(4, "minha senha", 200.0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
