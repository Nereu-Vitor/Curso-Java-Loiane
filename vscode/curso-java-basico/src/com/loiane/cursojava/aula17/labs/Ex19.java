package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int notas = scan.nextInt();

        double soma = 0.0;
        double media;
        double nota;

        for (int i = 0; i < notas; i++) {
            System.out.print("Digite a " + (i + 1) + "° nota: ");
            nota = scan.nextDouble(); 
            
            soma += nota;
        }

        media = soma / notas;

        System.out.println("Média das Notas: " + media);
        
    }
}
