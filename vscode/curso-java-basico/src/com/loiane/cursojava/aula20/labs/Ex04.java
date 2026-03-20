package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        boolean sair = false;
        byte opcao;
        int dia = 0;
        boolean diaValido;
        int hora = 0;
        boolean horaValida;
        while (!sair) {

            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromisso");
            System.out.println("0 - Sair");

            System.out.print("Digite uma opção: ");
            opcao = scan.nextByte();

            switch (opcao) {

                case 1:
                    diaValido = false;

                    while (!diaValido) {
                        System.out.print("Digite o dia do mês: ");
                        dia = scan.nextInt();

                        if (dia >= 1 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido, digite novamente.");
                        }

                    }

                    horaValida = false;
                    while (!horaValida) {

                        System.out.print("Digite a hora do compromisso: ");
                        hora = scan.nextInt();

                        if (hora >= 1 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida, digite novamente.");
                        }

                    }

                    dia--;
                    hora--;
                    System.out.print("Digite o compromisso: ");
                    compromissos[dia][hora] = scan.next();

                    break;

                case 2:

                    diaValido = false;

                    while (!diaValido) {
                        System.out.print("Digite o dia do mês: ");
                        dia = scan.nextInt();

                        if (dia >= 1 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido, digite novamente.");
                        }

                    }

                    horaValida = false;
                    while (!horaValida) {

                        System.out.print("Digite a hora do compromisso: ");
                        hora = scan.nextInt();

                        if (hora >= 1 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida, digite novamente.");
                        }

                    }

                    dia--;
                    hora--;
                    System.out.printf("O compromisso agendado é: %s %n", compromissos[dia][hora]);

                    break;

                case 0:
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }

        }
    }
}
