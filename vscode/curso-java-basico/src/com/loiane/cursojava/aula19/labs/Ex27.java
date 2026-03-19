package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição A = %d: ", i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 7) {
                vetorB[i] = 'a';
            } else if (vetorA[i] <= 7) {
                vetorB[i] = 'b'; 
            } else if (vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] <= 10) {
                vetorB[i] = 'd';
            } else {
                vetorB[i] = 'e';
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d ", vetorA[i]);
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("Letra: %c | Número: %d | ", vetorB[i], (int) vetorB[i]);
        }
        System.out.println(); 
    }
}
