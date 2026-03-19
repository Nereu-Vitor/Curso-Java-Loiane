package com.loiane.cursojava.aula20;

public class MatrizTridimencional {

    public static void main(String[] args) {

        int[][][] matrizTridimencional = new int[3][3][3];

        for (int i = 0; i < matrizTridimencional.length; i++) {
            for (int j = 0; j < matrizTridimencional[i].length; j++) {                
                for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
                    System.out.printf("i = %d - j = %d - k = %d %n", i , j, k);
                    matrizTridimencional[i][j][k] = i + j + k;
                }
            }
        }
        
        int somaTotal = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTridimencional.length; i++) {
            for (int j = 0; j < matrizTridimencional[i].length; j++) {                
                for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
                    
                    somaTotal += matrizTridimencional[i][j][k];
                    
                    if (matrizTridimencional[i][j][k] % 2 == 0) {
                        somaPares += matrizTridimencional[i][j][k];
                    } else {                        
                        somaImpares += matrizTridimencional[i][j][k];
                    }
                }
            }
        }

        System.out.printf("Soma Total = %d %n", somaTotal);
        System.out.printf("Soma Pares = %d %n", somaPares);
        System.out.printf("Soma Ímpares = %d %n", somaImpares);

    }
}
