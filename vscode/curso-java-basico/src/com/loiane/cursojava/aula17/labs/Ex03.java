package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean nomeValido = false;
        String nome;
        do {

            System.out.print("Digite seu nome: ");
            nome = scan.nextLine();

            if (nome.length() > 3) {
                System.out.println("Nome Válido");
                nomeValido = true;
            }

        } while (!nomeValido);

        boolean idadeValida = false;
        do {

            System.out.print("Digite sua idade: ");
            int idade = scan.nextInt();

            if (idade > 0 && idade <= 150) {
                System.out.println("Idade Válida");
                idadeValida = true;
            }

        } while (!idadeValida);

        boolean salarioValido = false;
        do {
            System.out.print();

        } while (!salarioValido);

        boolean sexoValido = false;
        do {
            System.out.print();

        } while (!sexoValido);

        boolean estadoCivilValido = false;
        do {
            System.out.print();

        } while (!estadoCivilValido);
    }
}
