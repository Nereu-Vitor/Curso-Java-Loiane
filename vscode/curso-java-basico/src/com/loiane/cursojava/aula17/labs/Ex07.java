package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite o " + (i + 1) + " número: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número digitado foi " + maior);
    }
}
