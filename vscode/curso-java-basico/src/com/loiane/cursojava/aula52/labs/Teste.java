package com.loiane.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {

            opcao = obterOpcaoMenu(scan);

            switch (opcao) {

                case 1:
                    consultarContato(scan, agenda);
                    break;

                case 2:
                    adicionarContato(scan, agenda);
                    break;
            }

        }

        scan.close();
    }

    private static void adicionarContato(Scanner scan, Agenda agenda) {

        try {

            System.out.println("Criando contato, digite as informações");
            String nome = lerInformacao(scan, "Digite o nome do contato: ");
            String telefone = lerInformacao(scan, "Digite o telefone do contato: ");
            String email = lerInformacao(scan, "Digite o email do contato: ");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato a ser criado");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {

            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }

    }

    private static void consultarContato(Scanner scan, Agenda agenda) {

        try {
            String nomeContato = lerInformacao(scan, "Digite o nome do contato a ser pesquisado: ");

            if (agenda.consultarContato(nomeContato) >= 0) {
                System.out.println("Contato existente");
            }
        } catch (ContatoNaoExisteException e) {

            System.out.println(e.getMessage());
        }
    }

    private static String lerInformacao(Scanner scan, String msg) {

        System.out.print(msg);

        String entrada = scan.nextLine();

        return entrada;
    }

    private static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {

            System.out.println("1 - Consultar Contato");
            System.out.println("2 - Adicionar Contato");
            System.out.println("3 - Sair");
            System.out.print("Digite a opção desejada: ");

            try {

                String entrada = scan.nextLine();

                opcao = Integer.parseInt(entrada);

                if (opcao >= 1 && opcao <= 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n");
            }
        }

        return opcao;
    }
}
