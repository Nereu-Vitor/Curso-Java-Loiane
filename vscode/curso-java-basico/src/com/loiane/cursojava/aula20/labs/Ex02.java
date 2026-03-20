package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Ex02 {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {

            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(9);
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {

            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.printf("%d ", numerosAleatorios[i][j]);
            }
            System.out.println();
        }

        int maiorLin5 = Integer.MIN_VALUE;
        int menorLin5 = Integer.MAX_VALUE;
        int linha5 = 5;
        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {

            if (numerosAleatorios[linha5][i] > maiorLin5) {
                maiorLin5 = numerosAleatorios[linha5][i];
            }

            if (numerosAleatorios[linha5][i] < menorLin5) {
                menorLin5 = numerosAleatorios[linha5][i];
            }
        }

        System.out.printf("Maior valor da linha 5 = %d %n", maiorLin5);
        System.out.printf("Menor valor da linha 5 = %d %n", menorLin5);
        
        int maiorCol7 = Integer.MIN_VALUE;
        int menorCol7 = Integer.MAX_VALUE;
        int coluna7 = 7;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            
            if (numerosAleatorios[i][coluna7] > maiorCol7) {
                maiorCol7 = numerosAleatorios[i][coluna7];
            }
            
            if (numerosAleatorios[i][coluna7] < menorCol7) {
                menorCol7 = numerosAleatorios[i][coluna7];
            }
        }

        System.out.printf("Maior valor da coluna 7 = %d %n", maiorCol7);
        System.out.printf("Menor valor da coluna 7 = %d %n", menorCol7);
    }
}
