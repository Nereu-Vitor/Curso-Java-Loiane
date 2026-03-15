package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        boolean ehPrimo;
        for (int i = 2; i <= num; i++) {

            ehPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                }
            }

            if (ehPrimo) {
                System.out.println(i + " é primo");
            } else {
                System.out.println(i + " não é primo");
            }
        }

    }
}
