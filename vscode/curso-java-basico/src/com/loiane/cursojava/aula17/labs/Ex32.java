package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean naoTerminar = true;
        int cod, qtd;
        double total = 0.0;
        String output = "";

        do {

            System.out.print("Digite o código e a quantidade(Digite 0 0 para sair.): ");
            cod = scan.nextInt();
            qtd = scan.nextInt();

            if (cod == 0 && qtd == 0) {
                naoTerminar = false;
                output += "Total a Pagar: R$ " + total + "\n";
            } else {

                switch (cod) {
                    case 100:
                        output += "Cachorro Quente -> 1,20 * " + qtd;
                        output += " = " + (1.2 * qtd) + "\n";

                        total += 1.2 * qtd;
                        break;

                    case 101:
                        output += "Bauru Simples -> 1,30 * " + qtd;
                        output += " = " + (1.3 * qtd) + "\n";
                        
                        total += 1.3 * qtd;
                        break;

                    case 102:
                        output += "Bauru com Ovo -> 1,50 * " + qtd;
                        output += " = " + (1.5 * qtd) + "\n";

                        total += 1.5 * qtd;
                        break;

                    case 103:
                        output += "Bauru com Ovo -> 1,20 * " + qtd;
                        output += " = " + (1.2 * qtd) + "\n";
                        total += 1.2 * qtd;
                        break;

                    case 104:
                        output += "Hambúrguer -> 1,30 * " + qtd;
                        output += " = " + (1.3 * qtd) + "\n";

                        total += 1.3 * qtd;
                        break;

                    case 105:
                        output += "Refrigerante -> 1,00 * " + qtd;
                        output += " = " + (1 * qtd) + "\n";

                        total += 1 * qtd;
                        break;

                    default:
                        System.out.println("Código Inválido!");
                }

            }

        } while (naoTerminar);

        System.out.println(output);
    }
}
