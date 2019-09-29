/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoorientada.trabalho3;

/**
 *
 * @author Pedro
 */
public class Cliente {
    
    private String nome;
    private ContaCorrente contaCorrente;

    public Cliente(String nome){
        this.nome = nome;
    }
    
    public void ligar(ContaCorrente contaCorrente){
        this.contaCorrente = contaCorrente;
    }
    
    public void depositar(double deposito){       
        contaCorrente.deposito(deposito);       
    }
    
    public void retirar(double retirar){
        contaCorrente.retirar(retirar);
    }
    
    public void imprimir(){
        System.out.println("Cliente: " + this.nome);
        contaCorrente.imprimir();
    }
    
}
