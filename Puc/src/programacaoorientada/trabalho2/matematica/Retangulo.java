/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoorientada.trabalho2.matematica;

/**
 *
 * @author Pedro
 */
public class Retangulo {

    private static float ladoH;
    private static float ladoV;

    public static void definir_lados(float pLadoH, float pLadoV) {
        ladoH = pLadoH;
        ladoV = pLadoV;
        assert (pLadoH > 0 && pLadoV > 0);
    }

    public static void area() {
        System.out.println("A area do Retangulo é: " + ladoH * ladoV);
    }

    public static void perimetro() {
        System.out.println("O Perimetro do Retangulo é: " + (ladoH + ladoV) * 2);
    }

}
