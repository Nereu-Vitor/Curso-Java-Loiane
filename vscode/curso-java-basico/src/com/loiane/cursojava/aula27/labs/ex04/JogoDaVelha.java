package com.loiane.cursojava.aula27.labs.ex04;

public class JogoDaVelha {

    public char[][] jogoVelha = new char[3][3];
    public int jogada = 1;

    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {
            return false;
        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;

            return true;
        }
    }

    public void imprimirTabuleiro() {

        for (int i = 0; i < jogoVelha.length; i++) {

            for (int j = 0; j < jogoVelha[i].length; j++) {

                System.out.printf("%c | ", jogoVelha[i][j]);
            }
            System.out.println();
        }

    }

    public boolean verificarGanhador(char sinal) {

        boolean ganhouLinha = (jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) ||
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal);

        boolean ganhouColuna = (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) ||
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal);

        boolean ganhouDiagonal = (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal &&
                jogoVelha[2][2] == sinal);

        boolean ganhouDiagonalInversa = (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal &&
                jogoVelha[2][0] == sinal);

        return ganhouLinha || ganhouColuna || ganhouDiagonal || ganhouDiagonalInversa;
    }

    public boolean verificarVezJogador1() {

        if (jogada % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

}
