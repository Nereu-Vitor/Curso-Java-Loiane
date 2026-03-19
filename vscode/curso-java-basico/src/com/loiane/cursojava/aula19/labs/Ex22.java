package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }

        double porc0 = (qtd0 * 100.0) / vetorA.length;
        double porc1 = (qtd1 * 100.0) / vetorA.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d ", vetorA[i]);
        }
        System.out.println();

        System.out.printf("Porcentagem 0 = %.1f%% %n", porc0);
        System.out.printf("Porcentagem 1 = %.1f%% %n", porc1);
    }
}
