package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite sua primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media < 7) {            
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}
