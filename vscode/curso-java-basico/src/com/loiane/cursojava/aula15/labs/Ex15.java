package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double lado1 = scan.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double lado2 = scan.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double lado3 = scan.nextDouble();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isóceles");
            } else  {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Não formam um triângulo.");
        }

    }
}
