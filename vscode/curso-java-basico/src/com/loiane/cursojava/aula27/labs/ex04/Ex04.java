package com.loiane.cursojava.aula27.labs.ex04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal = ' ';
        int linha = 0, coluna = 0;
        boolean linhaValida;
        boolean colunaValida;

        while (!ganhou) {

            if (jogoDaVelha.verificarVezJogador1()) {

                System.out.println("Vez do jogador 1. Escolha valor e coluna (1 - 3).");
                sinal = 'X';
            } else {

                System.out.println("Vez do jogador 2. Escolha valor e coluna (1 - 3).");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {            
                System.out.println("Posição já usada, tente novamente.");
            }

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {

                ganhou = true;
                System.out.println("Parabéns, jogador 1 venceu!");

            } else if (jogoDaVelha.verificarGanhador('O')) {

                ganhou = true;
                System.out.println("Parabéns, jogador 2 venceu!");

            } else if (jogoDaVelha.jogada > 9) {

                ganhou = true;
                System.out.println("Nínguem ganhou essa partida");

            }
        }
    }

    public static int valor(String tipoValor, Scanner scan) {

        int valor = 0;
        boolean linhaValida = false;

        while (!linhaValida) {

            System.out.printf("Digite a %s (1, 2 ou 3): ", tipoValor);
            valor = scan.nextInt();

            if (valor >= 1 && valor <= 3) {
                linhaValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente.");
            }

        }

        valor--;
        return valor;
    }
}
