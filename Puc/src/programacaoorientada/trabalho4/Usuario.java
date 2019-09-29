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
public class Usuario {
    
    private String nome;
    Conversa conversas;
    ArrayList<Usuario> listaContatos = new ArrayList();
    
    public Usuario(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void iniciaConversa(Usuario nomeContato){
        conversas = new Conversa(nomeContato);
        listaContatos.add(nomeContato);
    }
    
    public void enviarMensagem(Usuario destinatario, String mensagem){
        int index = listaContatos.indexOf(destinatario);
        listaContatos.get(index).conversas.enviarMensagem(mensagem);
    }
    
    public void imprimir(){
        conversas.imprimir();
    }
}
