package com.loiane.cursojava.aula34.labs.ex03;

import java.util.Scanner;

import com.loiane.cursojava.aula34.labs.ex02.Calculadora;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;

        do {
            
            System.out.print("Digite um número positivo: ");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Número inválido, digite novamente.");
            }

        } while (num < 0);

        System.out.printf("Fatorial de %d = %d %n", num, Calculadora.calcularFatorial(num));

    }
}
