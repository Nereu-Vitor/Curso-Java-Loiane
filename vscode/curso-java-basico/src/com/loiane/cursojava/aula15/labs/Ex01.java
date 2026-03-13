package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é o maior número");
        } else if (num1 < num2) {
            System.out.println(num2 + " é o maior número");            
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
