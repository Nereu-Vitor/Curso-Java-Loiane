package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro : ");
        int valor1 = scan.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor2 = scan.nextInt();

        System.out.print("Digite um número real: ");
        double valor3 = scan.nextDouble();

        int resultado1 = (2 * valor1) * (valor2 / 2);
        double resultado2 = (3 * valor1) + valor3;
        double resultado3 = Math.pow(valor3, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
