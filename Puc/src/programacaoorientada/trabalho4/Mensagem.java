/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoorientada.trabalho4;

/**
 *
 * @author Pedro
 */
public class Mensagem {
    
    private String texto;
    private String status = "Recebido";
   
    public String getTexto(){
        return texto;
    }
    
    public void mudaStatus(){
        status = "Visualizado";
    }
    
    public Mensagem(String texto){
        this.texto = texto;
    }
    
    public String getStatus(){
        return status;
    }
    
}
