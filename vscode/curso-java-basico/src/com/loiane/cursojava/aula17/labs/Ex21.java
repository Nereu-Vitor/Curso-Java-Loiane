package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int numTurmas = scan.nextInt();

        int numAlunos;
        int soma = 0;
        boolean invalido = true;

        for (int i = 1; i <= numTurmas; i++) {

            invalido = true;
            do {
                System.out.print("Digite o número de alunos da turma " + i + ": ");
                numAlunos = scan.nextInt();

                if (numAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Número de alunos inválido. Digite novamente!");
                }                
                
            } while (invalido);
         
            soma += numAlunos;
        }

        double media = soma / numTurmas;

        System.out.print("Média de Alunos por Turma: " + media);
    }
}
