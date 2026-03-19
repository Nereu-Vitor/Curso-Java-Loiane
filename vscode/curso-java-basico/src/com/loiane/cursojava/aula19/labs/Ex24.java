package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição %d: ", i);
            vetorA[i] = scan.nextInt();

        }

        boolean palindromo = true;
        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length / 2; i++) {
            System.out.printf("%d ", vetorA[i]);
        }
        System.out.println();

        if (palindromo) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não é Palíndromo");
        }
    }
}
