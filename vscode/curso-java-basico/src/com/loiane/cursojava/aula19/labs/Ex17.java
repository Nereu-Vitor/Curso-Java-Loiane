package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scan.nextInt();
        }

        int qtdMaior35 = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 35) {
                qtdMaior35++;
            }
        }

        System.out.print("Vetor de idades = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de pessoas com idade maior que 35: " + qtdMaior35);
    }
}
