package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex22 {

        public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

            System.out.print("Digite a quantidade de morangos(em kg): ");
            double qtdMorango = scan.nextDouble();

            System.out.print("Digite a quantidade de maçã(em kg): ");
            double qtdMaca = scan.nextDouble();

            double precoMorango = 0.0;
            if (qtdMorango <= 5) {
                precoMorango = 2.5;
            } else {
                precoMorango = 2.2;
            }

            double precoMaca = 0.0;
            if (qtdMaca <= 5) {
                precoMaca = 1.8;
            } else {
                precoMaca = 1.5;
            }

            double precoTotalMorango = precoMorango * qtdMorango;
            double precoTotalMaca = precoMaca * qtdMaca;

            double precoParcial = precoTotalMorango + precoTotalMaca;
            double precoTotal = precoParcial;

            if ((qtdMorango + qtdMaca) > 8) {
                precoTotal = precoParcial - (precoParcial * 10 / 100);
            }            
        
            System.out.println("Preço total: R$" + precoTotal);
    }
}
