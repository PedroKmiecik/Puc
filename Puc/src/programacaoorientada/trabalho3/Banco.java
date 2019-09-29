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
public class Banco {
    
    public static void main(String[] args) {
        Cliente jandira = new Cliente("Jandira Silva");
        ContaCorrente conta1 = new ContaCorrente(84037,2500.00);
        jandira.ligar(conta1);
        Cliente sandra = new Cliente("Sandra Rodrigues");
        ContaCorrente conta2 = new ContaCorrente(70662, 1800.00);
        sandra.ligar(conta2);
        Cliente luciana = new Cliente("Luciana Teixeira");
        ContaCorrente conta3 = new ContaCorrente(20718, 5000.00);
        luciana.ligar(conta3);
        
        jandira.imprimir();
        sandra.imprimir();
        luciana.imprimir();
        
        jandira.retirar(1000.00);
        jandira.imprimir();
        
        sandra.retirar(2000.00);
        sandra.depositar(500.00);
        sandra.imprimir();
        
        sandra.retirar(2000.00);
        sandra.imprimir();
        
        luciana.depositar(1000.00);
        luciana.imprimir();
        
    }
    
}
