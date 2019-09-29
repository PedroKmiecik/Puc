package programacaoorientada.trabalho5;

public class Teste {

	public static void main(String[] args) {

		Principiante j1 = new Principiante("Pedro", 150, 15.0);
		Profissional j2 = new Profissional("Caio", 460, 190.0);
		Senior j3 = new Senior("Rafael", 890, 340.0, 600.0);

		j1.ganhar(150);
		j1.perder(50);
		j1.imprimir();

		j2.ganhar(300);
		j2.perder(100);
		j2.imprimir();

		j3.ganhar(600);
		j3.perder(200);
		j3.imprimir();

	}

}
