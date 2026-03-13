package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau");
        } else {
            System.out.print("Digite o valor de b: ");
            int b = scan.nextInt();

            System.out.print("Digite o valor de c: ");
            int c = scan.nextInt();
            
            double delta = (Math.pow(b, 2)) - (4 * a * c);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais");
            } if (delta == 0) {
                System.out.println("Delta: " + delta);

                double x = -b / (2 * a);

                System.out.println("A equação só possui uma raiz real x = " + x);
            } else  {
                System.out.println("Delta: " + delta);

                double x1 = (((-b)) + Math.sqrt(delta)) / (2 * a);
                double x2 = (((-b)) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
