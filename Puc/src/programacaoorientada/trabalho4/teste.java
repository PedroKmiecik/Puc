/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoorientada.trabalho4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Pedro
 */
public class teste {

    static ArrayList<String> teste = new ArrayList();

    public static void main(String[] args) {
        int index = 0;

        teste.add("Pedro");
        teste.add("Miczewski");
        teste.add("Caio");
        teste.add("Rafael");

        index = teste.indexOf("Caio");
        
//        for (int i = 0; i < teste.size(); i++) {
//            if (teste.get(i).equals("Caio")) {
//                index = i;
//                break;
//            }
            System.out.println(index);

//        if(teste.contains("Andre")){
//            System.out.println("Tem");
//            count = teste.c
//        } else{
//            System.out.println("Nao tem");
//        }
//
//        Set<String> set = new HashSet<String>(teste);
//        if (set.contains("Caio")) {
//            System.out.println("String found!");
//            System.out.println(set);
//        }
//  String s = "Hello World my name is pedro ";
//
//      // create a new scanner with the specified String Object
//      Scanner scanner = new Scanner(teste.toString());
//
//      while(scanner.equals("Miczewski"))
//scanner.next();
//        System.out.println(scanner.next());
//
//      // close the scanner
//      scanner.close();
        }

    }
