package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean notaValida = false;
        do {
            
            System.out.print("Digite um nota: ");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota Válida!");
                notaValida = true;
            } else {
                System.out.println("Nota Inválida, digite novamente!");
            }

        } while (!notaValida);
    }
}
