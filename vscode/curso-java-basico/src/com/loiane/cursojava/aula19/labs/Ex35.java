package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição %d: ", i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Analizando o número %d%n", vetorA[i]);

            for (int j = 1; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.printf("%d é divisor de %d %n", j, vetorA[i]);                    
                }
            }                        
            System.out.println();
        }
    }
}
