package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }
    
        int qtdPares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }            
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números pares no vetorA: " + qtdPares);
    }
}
