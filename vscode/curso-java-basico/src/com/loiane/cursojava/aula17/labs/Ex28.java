package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        boolean ehPrimo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                ehPrimo = false;
            }

        }

        if (ehPrimo) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }
}
