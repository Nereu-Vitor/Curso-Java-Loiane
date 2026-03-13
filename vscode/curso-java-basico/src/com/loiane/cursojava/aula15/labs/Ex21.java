package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex21 {

        public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantos litros foram vendidos: ");
        double litros = scan.nextDouble();

        System.out.print("Digite o tipo de combustível(A ou G): ");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int perDesconto = 0;
        double total = 0.0;
        double totalDesc = 0.0;

        if (tipo.equalsIgnoreCase("a")) {
            
            if (litros <= 20) {
                perDesconto = 3;
            } else {
                perDesconto = 5;
            }
            
            total = litros * precoAlc;
            
        } else if (tipo.equalsIgnoreCase("g")) {
            
            if (litros <= 20) {
                perDesconto = 4;
            } else {
                perDesconto = 6;
            }
            
            total = litros * precoAlc;
            
        }

        totalDesc = total * perDesconto / 100;

        double precoAPagar = total - totalDesc;

        System.out.println("Valor a ser pago: R$" + precoAPagar);
    }
}
