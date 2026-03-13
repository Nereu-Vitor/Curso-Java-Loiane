package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);        

        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Digite quantas horas você trabalha no mês: ");
        double horasTrabalhadas = scan.nextInt();

        double totalMensal = valorHora * horasTrabalhadas;
        System.out.println("O total ganho por mês é de R$" + totalMensal);
    }
}
