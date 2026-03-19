package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição A - %d: ", i);
            vetorA[i] = scan.nextInt();

            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {

            System.out.printf("Digite um número para a posição B - %d: ", i);
            vetorB[i] = scan.nextInt();
            
            vetorC[vetorA.length + i] = vetorB[i];
        }    

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d ", vetorA[i]);
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("%d ", vetorB[i]);
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("%d ", vetorC[i]);
        }
        System.out.println();
    }
}
