package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex23 {

        public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Tipos de Carne");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        System.out.print("Digite o tipo da carne: ");
        int tipo = scan.nextInt();
        
        System.out.print("Digite a quantidade(em kg): ");
        double qtdCarne = scan.nextDouble();
        
        double precoKg = 0.0;
        if (tipo == 1) {
            
            if (qtdCarne <= 5) {
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }

        } else if (tipo == 2) {
            
            if (qtdCarne <= 5) {
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }

        } else if (tipo == 3) {

            if (qtdCarne <= 5) {
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }

        }

        double total = qtdCarne * precoKg;
        System.out.println(qtdCarne + "kg * " + precoKg + " = R$" + total);
        
        System.out.print("Compra no cartão?(Digite S): ");
        String cartao = scan.next();

        if (cartao.equalsIgnoreCase("S")) {
            double desconto = total * 5 / 100;
            System.out.println("Desconto de: R$" + desconto);
            System.out.println("Valor a pagar: R$" + (total - desconto));
        } else {
            System.out.println("Valor a pagar: R$" + total);
        }
    }
}
