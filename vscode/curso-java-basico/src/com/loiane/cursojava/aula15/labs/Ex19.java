package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Digite a operação(+ - / *): ");
        String operacao = scan.next();

        double resul = 0.0;
        boolean valida = true;

        switch (operacao) {
            case "+":            
                resul = num1 + num2;
                break;
            case "-":
                resul = num1 - num2;
                break;
            case "*":
                resul = num1 * num2;
                break;
            case "/":
                resul = num1 / num2;
                break;
            default:
                System.out.println("Operação Inválida");
                valida = false;
        }

        if (valida) {
            System.out.println("Resultado: " + resul);

            if (resul > 0) {
                System.out.println("Resultado Positivo");
            } else {
                System.out.println("Resultado Negativo");
            }

            if (resul % 2 == 0) {
                System.out.println("Resultado Par");
            } else {
                System.out.println("Resultado Ímpar");
            }
        }
    }
}
