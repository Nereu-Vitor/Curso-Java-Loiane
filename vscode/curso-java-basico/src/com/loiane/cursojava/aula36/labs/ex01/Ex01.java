package com.loiane.cursojava.aula36.labs.ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);
        agenda.setNome(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {

            Contato c = new Contato();

            System.out.printf("Digite as informações do %d° contato%n", (i + 1));

            System.out.print("Digite o nome: ");
            c.setNome(scan.nextLine());

            System.out.print("Digite o telefone: ");
            c.setTelefone(scan.nextLine());

            System.out.print("Digite o email: ");
            c.setEmail(scan.nextLine());

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }

        scan.close();
    }
}
