package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: R$");
        double valorHora = scan.nextDouble();

        System.out.print("Digite quantas horas você trabalha: ");
        double qtdHoras = scan.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        int percentualIr = 0;
        if (salarioBruto <= 900) {
            percentualIr = 0;
        } else if (salarioBruto <= 1500) {
            percentualIr = 5;
        } else if (salarioBruto <= 2500) {
            percentualIr = 10;
        } else {
            percentualIr = 20;
        }

        double ir = salarioBruto * percentualIr / 100;
        double inss = salarioBruto * 10 / 100;
        double fgts = salarioBruto * 11 / 100;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + "): R$" + salarioBruto);
        System.out.println("(-) IR (" + percentualIr + "%): R$" + ir);
        System.out.println("(-) INSS ( 10%): R$" + inss);
        System.out.println("FGTS (11%): R$" + fgts);
        System.out.println("Total de descontos: R$"+ totalDescontos);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
