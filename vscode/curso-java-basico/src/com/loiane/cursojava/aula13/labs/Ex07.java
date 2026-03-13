package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é: " + area + " m².\n");
        System.out.print("O dobro da área do quadrado é: " + (area * 2) + " m².\n");
    }
}
