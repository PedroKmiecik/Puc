/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoorientada.trabalho4;

import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class Conversa {

    private Usuario nome;
    ArrayList<Mensagem> conversas = new ArrayList();

    public Conversa(Usuario nome) {
        this.nome = nome;
    }

    public void enviarMensagem(String mensagem) {
        Mensagem msg = new Mensagem(mensagem);
        conversas.add(msg);
    }

    public void imprimir() {
        for (Mensagem i : conversas) {
            i.mudaStatus();
            System.out.println(nome.getNome() + " Disse: " + i.getTexto() + " - " + i.getStatus());
        }
    }

}
