package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = 0; j < numeros[i].length; j++) {
                
                System.out.printf("Digite um número para a posição [%d, %d]:", i, j);
                numeros[i][j] = scan.nextInt();                
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = 0; j < numeros[i].length; j++) {
                 
                if (numeros[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {

                System.out.printf("%d ", numeros[i][j]);
            }            
            System.out.println();
        }

        System.out.printf("Quantidade de números pares digitados: %d %n", qtdPares);
        System.out.printf("Quantidade de números ímpares digitados: %d %n", qtdImpares);
    }
}
