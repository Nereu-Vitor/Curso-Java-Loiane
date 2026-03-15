package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de idades: ");
        int idades = scan.nextInt();

        int idade;
        int soma = 0;

        for (int i = 0; i < idades; i++) {
            System.out.print("Digite a " + (i + 1) + "ª idade: ");
            idade = scan.nextInt();

            soma = +idade;
        }

        double media = soma / idades;

        System.out.println("A média de idade da turma é: " + media);
        
        if (media <= 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 60) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

    }
}
