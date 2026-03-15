package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número que deseja exibir a tabuada: ");
        int num = scan.nextInt();

        System.out.print("Digite em qual número deve começar a tabuada: ");
        int comeco = scan.nextInt();

        boolean numValido = false;
        int fim;
        do {
            System.out.print("Digite e qual número deve terminar: ");
            fim = scan.nextInt();

            if (fim >= comeco) {
                numValido = true;
            } else {
                System.out.println("Número inválido. O fim não deve ser menor que o começo. Digite novamente.");
            }

        } while (!numValido);

        System.out.println("Vou montar a tabuda de " + num + " começando em " + comeco + " e terminando em " + fim);
        for (int i = comeco; i <= fim; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
