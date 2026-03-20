package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal = ' ';
        int linha = 0;
        boolean linhaValida;
        int coluna = 0;
        boolean colunaValida;

        while (!ganhou) {

            if (jogada % 2 == 1) {

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1 - 3).");
                sinal = 'X';

            } else {

                System.out.println("Vez do jogador 2. Escolha linha e coluna (1 - 3).");
                sinal = 'O';

            }

            linhaValida = false;
            while (!linhaValida) {

                System.out.print("Digite a linha (1, 2 ou 3): ");
                linha = scan.nextInt();

                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente.");
                }

            }

            colunaValida = false;
            while (!colunaValida) {

                System.out.print("Digite a coluna (1, 2 ou 3): ");
                coluna = scan.nextInt();

                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente.");
                }

            }

            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente.");
            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i < jogoVelha.length; i++) {

                for (int j = 0; j < jogoVelha[i].length; j++) {

                    System.out.printf("%c | ", jogoVelha[i][j]);
                }
                System.out.println();
            }

            boolean xGanhouLinha = (jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X');
            boolean xGanhouColuna = (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') ||
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X');
            boolean xGanhouDiagonal = (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X');
        
            boolean oGanhouLinha = (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O');
            boolean oGanhouColuna = (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O');
            boolean oGanhouDiagonal = (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O');

            if (xGanhouLinha || xGanhouColuna || xGanhouDiagonal) {
                ganhou = true;
                System.out.println("Parabéns, jogador 1 venceu!");
            } else if (oGanhouLinha || oGanhouColuna || oGanhouDiagonal) {                
                ganhou = true;
                System.out.println("Parabéns, jogador 2 venceu!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Nínguem ganhou essa partida");
            }
        }
    }
}
