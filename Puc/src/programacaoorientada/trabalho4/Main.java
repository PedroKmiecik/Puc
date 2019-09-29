/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoorientada.trabalho4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Main {

    public static void main(String[] args) {

        Usuario newUser;

        Usuario pedro = new Usuario("Pedro");
        Usuario miczewski = new Usuario("Miczewski");

        pedro.iniciaConversa(miczewski);
        miczewski.iniciaConversa(pedro);

        pedro.enviarMensagem(miczewski, "Fala tú");
        miczewski.enviarMensagem(pedro, "Salve");
        pedro.enviarMensagem(miczewski, "blz?");
        miczewski.enviarMensagem(pedro, "blz");
        miczewski.enviarMensagem(pedro, "Megéra");

        miczewski.imprimir();
        pedro.imprimir();

    }

}
