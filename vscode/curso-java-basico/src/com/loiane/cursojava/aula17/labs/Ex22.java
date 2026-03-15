package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex22 {

   public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de CDs: ");
        int cds = scan.nextInt();

        double preco;
        double soma = 0;

        for (int i = 1; i<= cds; i++) {

            System.out.print("Digite o valor do " + i + "° cd: ");
            preco = scan.nextDouble();

            soma += preco;
        }

        double media = soma / cds;
        
        System.out.println("O preço médio gasto com cada CD é: R$" + media);
   } 
}
