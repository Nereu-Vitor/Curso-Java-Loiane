package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        int qtdImpares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {                
                qtdImpares++;
            }
        }

        int qtdPares = vetorA.length - qtdImpares;

        double porcPar = (qtdPares * 100.0) / vetorA.length;
        double porcImpar = 100.0 - porcPar;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem de números pares: " + porcPar + "%");    
        System.out.println("Porcentagem de números ímpares: " + porcImpar + "%");    
    }
}
