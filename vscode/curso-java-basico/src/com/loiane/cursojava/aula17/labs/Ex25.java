package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago, troco;

        do {
            
            System.out.print("Deseja informar uma nova compra?(S/N) ");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")) {
                
                output = "Lojas Tabaja\n";

                System.out.print("Digite a quantidade de produtos da compra: ");
                qtdProdutos = scan.nextInt();

                total = 0.0;

                for (int i = 1; i <= qtdProdutos; i++) {
                    
                    System.out.print("Digite o preço do " + i + "° produto: R$");
                    preco = scan.nextDouble();

                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n"; 
                }

                output += "Total: R$ " + total + "\n";

                System.out.println("Total: R$ " + total);

                System.out.print("Digite o valor a pago: R$");
                valorPago = scan.nextDouble();

                output += "Valor Pago: R$ " + valorPago + "\n";
                
                troco = valorPago - total;
                
                output += "Troco: R$ " + troco + "\n";

                System.out.println(output);

            } else {
                sair = true;
            }

        } while (!sair);
    }
}
