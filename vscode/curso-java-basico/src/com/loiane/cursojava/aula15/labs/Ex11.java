package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu salário R$: ");
        double salarioAtual = scan.nextDouble();

        double percentual = 0;
        if (salarioAtual <= 280) {
            percentual = 20;
        } else if (salarioAtual < 700) {
            percentual = 15;
        } else if (salarioAtual < 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double aumento = salarioAtual * percentual / 100;
        double salarioReajustado = salarioAtual + aumento;

        System.out.println("Salário Atual: R$" + salarioAtual);
        System.out.println("Percentual de Aumento: " + percentual + "%");
        System.out.println("Aumento: R$" + aumento);
        System.out.println("Salário Reajustado: R$" + salarioReajustado);

    }
}
