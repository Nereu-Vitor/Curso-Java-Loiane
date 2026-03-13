package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite um segundo número: ");
        int num2 = scan.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);
    }
}
