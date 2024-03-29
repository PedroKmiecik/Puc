package programacaoorientada.trabalho6;

import java.util.ArrayList;

public class Pasta {

	private String nome;
	private ArrayList<Arquivo> arquivos = new ArrayList();

	public Pasta(String nome) {
		this.nome = nome;
	}

	public void inserir(Arquivo arquivo) {
		arquivos.add(arquivo);
	}

	public void remover(String arquivo) {
		int i = 0;
		while (i < arquivos.size()) {
			if (arquivos.get(i).getNome().equals(arquivo)) {
				arquivos.remove(arquivos.get(i));
				break;
			}
			i++;
		}
	}

	public void listar() {
		ArrayList<String> lista = new ArrayList();
		int i = 0;
		while (i < arquivos.size()) {
			lista.add(arquivos.get(i).getNome());
			i++;
		}
		System.out.println(lista);
	}

	public void duplicar(String nome) {
		int i = 0;
		while (i < arquivos.size()) {
			if (arquivos.get(i).getNome().equals(nome)) {
				arquivos.add(arquivos.get(i));
				break;
			}
			i++;
		}
	}

}
