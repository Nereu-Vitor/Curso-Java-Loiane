package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        int somaMenor15 = 0;
        int somaMaior15 = 0;
        int qtdMaior15 = 0;
        int qtdIgual15 = 0;
        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] == 15) {
                qtdIgual15++;
            } else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            } else {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        double mediaMaior15 = somaMaior15 / qtdMaior15;
        
        System.out.println("Quantidade de números igual 15: " + qtdIgual15);
        System.out.println("Soma dos números menores que 15: " + somaMenor15);
        System.out.println("Média dos números maior que 15: " + mediaMaior15);
    }
}
