package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o turno que você estuda(M, V ou N): ");
        String turno = scan.next();

        switch (turno) {

            case "m":
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }
}
