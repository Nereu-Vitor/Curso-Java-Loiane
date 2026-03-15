package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de temperaturas: ");
        int qtdTemperaturas = scan.nextInt();

        double temp;
        double soma = 0.0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;    

        for (int i = 1; i <= qtdTemperaturas; i++) {
            System.out.print("Digite a " + i + "ª temperatura: ");
            temp = scan.nextDouble();

            soma += temp;

            if (temp > maior) {
                maior = temp;
            }

            if (temp < menor) {
                menor = temp;
            }
        }

        double media = soma / qtdTemperaturas;

        System.out.println("Maior Temperatura: " + maior);
        System.out.println("Menor Temperatura: " + menor);
        System.out.println("Média das Temperaturas: " + media);
    }
}
