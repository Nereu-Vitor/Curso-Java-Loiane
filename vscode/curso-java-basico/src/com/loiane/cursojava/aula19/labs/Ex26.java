package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição A = %d: ", i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {

            System.out.printf("Digite um número para a posição B = %d: ", i);
            vetorB[i] = scan.nextInt();

            if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else {
                vetorC[i] = -1;
            }
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
