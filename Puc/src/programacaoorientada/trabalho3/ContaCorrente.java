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
public class ContaCorrente {
    
    private int numero;
    private double saldo;
    
    public ContaCorrente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
        assert(saldo > 0);
    }
    
    public void deposito(double deposito){
        saldo += deposito;
    }
    
    public void retirar(double retirar){
        if(saldo >= retirar){
            saldo -= retirar;
        } else{
            System.out.println("Saldo Insuficiente para retirada.");
        }
    }
    public void imprimir(){
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Saldo da Conta: " + saldo);
    }
}
