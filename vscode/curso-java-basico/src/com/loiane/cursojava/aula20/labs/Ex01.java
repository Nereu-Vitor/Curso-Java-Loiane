package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Ex01 {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(9);
            }
        }
        
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int col = 0;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            
            for (int j = 0; j < numerosAleatorios.length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }                
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.printf("%d ", numerosAleatorios[i][j]);
            }
            System.out.println();
        }

        System.out.printf("Maior valor = %d %n", maior);
        System.out.printf("Linha = %d %n", linha);
        System.out.printf("Coluna = %d %n", col);
    }
}
