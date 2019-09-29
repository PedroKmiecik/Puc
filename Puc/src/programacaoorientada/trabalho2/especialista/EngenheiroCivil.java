/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoorientada.trabalho2.especialista;

import programacaoorientada.trabalho2.matematica.Retangulo;

/**
 *
 * @author Pedro
 */
public class EngenheiroCivil {

    private static String nome = "Rafael Basso";
    private static int idade = 19;

    private static void exibir_dados_pessoais() {
        System.out.println(nome);
        System.out.println(idade + " anos");
    }

    public static void main(String[] args) {
        exibir_dados_pessoais(); 
        Retangulo.definir_lados((float) 4.7, (float) 8.2);

        Retangulo.area();
        Retangulo.perimetro();
    }
}
