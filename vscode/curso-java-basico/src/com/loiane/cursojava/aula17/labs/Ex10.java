package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt(); 

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Números dentro do intervalo fornecido: ");

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }

    }
}
