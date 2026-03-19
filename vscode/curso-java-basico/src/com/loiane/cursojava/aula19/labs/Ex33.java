package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite um número para a posição %d: ", i);
            vetorA[i] = scan.nextInt();
        }

        boolean ehPrimo;
        String msg;
        for (int i = 0; i < vetorA.length; i++) {

            ehPrimo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {                    
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                msg = "É Primo";
            } else {
                msg = "Não é Primo";                
            }

            System.out.printf("%d - %s %n", vetorA[i], msg);
        }
    }
}
