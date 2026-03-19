package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição %d: ", i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Analizando o número %d%n", vetorA[i]);

            for (int j = 0; j < vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.printf("%d é par %n", j);                    
                }
            }                        
            System.out.println();
        }
    }
}
