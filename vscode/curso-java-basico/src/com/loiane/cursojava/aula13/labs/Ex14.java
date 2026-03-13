package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();

        System.out.print("Digite a velocidade da internet: ");
        double velInternet = scan.nextDouble();
        
        double tempo = tamArquivo / velInternet;
        System.out.println("O tempo de download é: " + tempo);
    }
}
