package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {

            System.out.print("Digite seu nome: ");
            nome = scan.nextLine();

            if (nome.length() > 3) {
                System.out.println("Nome Válido");
                infoValida = true;
            } else {
                System.out.println("Nome inválido. Digite novamente!");
            }

        } while (!infoValida);

        infoValida = false;
        do {

            System.out.print("Digite sua idade: ");
            idade = scan.nextInt();

            if (idade > 0 && idade <= 150) {
                System.out.println("Idade Válida");
                infoValida = true;
            } else {
                System.out.println("Idade inválida. Digite novamente!");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Digite seu salário: R$");
            salario = scan.nextDouble();

            if (salario > 0) {
                System.out.println("Salário Válido");
                infoValida = true;
            } else {
                System.out.println("Salário inválido. Digite novamente!");
            }

        } while (!infoValida);

        infoValida = false;
        do {

            System.out.print("Digite o seu sexo(F ou M): ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
                System.out.println("Sexo Válido");
                infoValida = true;
            } else {
                System.out.println("Sexo inválido. Digite novamente!");
            }

        } while (!infoValida);

        infoValida = false;
        do {

            System.out.print("Digite seu estado civil(S, C, V ou D): ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")) {
                System.out.println("Estado Civil Válido");
                infoValida = true;
            } else {
                System.out.println("Estado civil inválido. Digite novamente!");
            }

        } while (!infoValida);
    }
}
