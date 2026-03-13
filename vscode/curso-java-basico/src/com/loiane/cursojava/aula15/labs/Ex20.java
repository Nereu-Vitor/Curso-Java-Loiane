package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Telefonou para a vítima? ");
        String resp1 = scan.next();

        System.out.print("Esteve no local do crime? ");
        String resp2 = scan.next();

        System.out.print("Mora perto da vítima? ");
        String resp3 = scan.next();

        System.out.print("Já trabalhou com a vítima? ");
        String resp4 = scan.next();

        System.out.print("Devia para a vítima? ");
        String resp5 = scan.next();

        int pontos = 0;

        if (resp1.equalsIgnoreCase("S")) {
            pontos++;
        }

        if (resp2.equalsIgnoreCase("S")) {
            pontos++;
        }

        if (resp3.equalsIgnoreCase("S")) {
            pontos++;
        }

        if (resp4.equalsIgnoreCase("S")) {
            pontos++;
        }

        if (resp5.equalsIgnoreCase("S")) {
            pontos++;
        }

        switch (pontos) {
            case 0:
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
        }
    }
}
