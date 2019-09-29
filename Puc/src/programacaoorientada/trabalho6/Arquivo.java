package programacaoorientada.trabalho6;

public class Arquivo {

	private String nome;
//  	private byte[] bytes = new byte[5];
	
	public Arquivo(String nome) {
		this.nome = nome;
	}
	
	public void abrir(byte b) {
		if(b == 0) {
			System.out.println("Microsoft Word");
		} else if (b == 1) {
			System.out.println("Fotos");
		} else if (b == 2) {
			System.out.println("Windows Media Player");
		} else if(b == 3) {
			System.out.println("VLC Player");
		} else if(b == 4) {
			System.out.println("Microsoft Excel");
		} else {
			System.out.println("Microsoft PowerPoint");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
}
