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

public class Semaforo {

    static int cor = 2;

    static void MudaProximaCor() {
        if (cor == 2) {
            cor = 0;
        } else {
            cor++;
        }
    }

    static void MudaCorFixa(int corFixa) {
        cor = corFixa;
    }

    static int MostraCor() {
        return cor;
    }

    static void MostraNomeCor() {
        switch (cor) {
            case 0:
                System.out.println("Cor atual: Verde ");
                break;
            case 1:
                System.out.println("Cor atual: Amarelo ");
                break;
            case 2:
                System.out.println("Cor atual: Vermelho ");
                break;
        }
    }
}
