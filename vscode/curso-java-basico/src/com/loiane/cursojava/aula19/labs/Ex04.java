package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat format = new DecimalFormat("###,###.##");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(format.format(vetorB[i]) + " ");
        }
        System.out.println();
    }
}
