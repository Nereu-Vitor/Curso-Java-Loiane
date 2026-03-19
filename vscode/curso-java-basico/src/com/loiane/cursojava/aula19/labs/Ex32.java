package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição %d: ", i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Tabuada de %d: %n", vetorA[i]);

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d %n", vetorA[i], j, (vetorA[i] * j));
            }       
                 
            System.out.println();
        }
    }
}
