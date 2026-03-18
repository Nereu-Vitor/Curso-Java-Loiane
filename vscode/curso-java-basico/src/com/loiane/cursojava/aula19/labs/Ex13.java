package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                soma += vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Soma dos múltiplos de 5 presentes no vetorA: " + soma);
    }
}
