/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pedro
 */

package programacaoorientada.trabalho1;

public class Controle {
    
    public static void main(String[] args) {
        Semaforo.MostraNomeCor();
        System.out.println(Semaforo.MostraCor());
       
        int count = 0;
        
        while (count < 10) {
            Semaforo.MudaProximaCor();
            Semaforo.MostraNomeCor();
            System.out.println(Semaforo.MostraCor());
            count ++;
        }
        
        Semaforo.MudaCorFixa(1);
        Semaforo.MostraNomeCor();
        System.out.println(Semaforo.MostraCor());
     
    }
}
