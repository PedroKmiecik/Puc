package programacaoorientada.trabalho7;

public class Main {

	public static void main(String[] args) {
		
		Batman batman = new Batman();
		JamesBond jamesbond = new JamesBond();
		Coringa coringa = new Coringa();
		Pinguim pinguim = new Pinguim();
		Goldfinger goldfinger = new Goldfinger();
		DrNo drno = new DrNo();
		
		batman.atirar();
		batman.camuflar(3);
		
		jamesbond.atirar();
		jamesbond.saltar(5);
		
		coringa.atirar();
		
		pinguim.atirar();
		pinguim.correr(5, 10);
		
		goldfinger.saltar(5);
		goldfinger.camuflar(3);
		goldfinger.personificar(jamesbond);
		
		drno.saltar(5);
		drno.atirar();
		drno.correr(5, 10);
		drno.morrer();
		
	}
	
}
