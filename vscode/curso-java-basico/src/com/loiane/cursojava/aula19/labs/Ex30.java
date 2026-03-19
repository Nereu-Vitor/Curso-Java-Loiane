package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição A - %d: ", i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
            } else {
                vetorC[i] = vetorA[i];                
            }
        }

        int posB = 0;
        int posC = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            } else {
                vetorC[posC] = vetorA[i];       
                posC++;
            }
        }
       
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d ", vetorA[i]);
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < posB; i++) {
            System.out.printf("%d ", vetorB[i]);
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i < posC; i++) {
            System.out.printf("%d ", vetorC[i]);
        }
        System.out.println();
    }
}
