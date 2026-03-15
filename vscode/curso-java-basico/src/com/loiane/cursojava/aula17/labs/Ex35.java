package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scan.nextInt();

        double soma = 0;
        int i = 1;
        int j = 1;

        for (; i < n; i++, j += 2) {
            System.out.print(i + "/" + j + " + ");
            soma += i / j;
        }

        System.out.print(i + "/" + j + " = " + soma + "\n");
    }
}
