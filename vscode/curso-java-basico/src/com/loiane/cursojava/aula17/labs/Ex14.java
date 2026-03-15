package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int num;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            num = scan.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }        

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
