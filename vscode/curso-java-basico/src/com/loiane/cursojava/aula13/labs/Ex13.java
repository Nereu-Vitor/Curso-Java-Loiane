package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Digite quantas horas você trabalha no mês: ");
        double horasTrabalhadas = scan.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 11 / 100;
        double sindicato = salarioBruto * 5 / 100;
        double ir = salarioBruto * 8 / 100;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("INSS: R$" + inss);
        System.out.println("Sindicato: R$" + sindicato);
        System.out.println("IR: R$" + ir);
        System.out.println("Total Descontos: R$" + totalDescontos);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
