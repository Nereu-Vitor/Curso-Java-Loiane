package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.print("Digite a cotação do dólar: U$");
        cotacao = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }

        DecimalFormat format = new DecimalFormat("###,###.##");

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}
