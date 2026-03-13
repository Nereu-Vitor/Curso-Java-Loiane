package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra(a-z): ");
        String letra = scan.next();

        /*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
        }*/

        if (letra.length() > 1) {
            System.out.println("Não é uma letra");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U": break;
                default: System.out.println("Consoante");
            }
        }
        
    }
}
