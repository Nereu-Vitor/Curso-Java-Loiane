package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de pessoas que serão entrevistadas: ");
        int numEntrevistadas = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistadas][];

        for (int i = 0; i < nomesFilhos.length; i++) {
            
            System.out.printf("Digite a quantidade de filhos: ");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {
                
                System.out.printf("Digite o nome do filho %d: ", (j + 1));

                nomesFilhos[i][j] = scan.next();                
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {    

            System.out.printf("Pessoa %d tem %d filhos %n", i, nomesFilhos[i].length);            
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.printf("%s %n", nomesFilhos[i][j]);
            }
        }
    }
}
