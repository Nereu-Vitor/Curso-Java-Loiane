package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = scan.nextDouble();
        
        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = scan.nextDouble();
                
        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = scan.nextDouble();  
        
        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Produto 1 é mais barato. Pode comprar");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Produto 2 é mais barato. Pode comprar");
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("Produto 3 é mais barato. Pode comprar");
        }
    }
}
