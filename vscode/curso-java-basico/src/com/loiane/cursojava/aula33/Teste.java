package com.loiane.cursojava.aula33;

public class Teste {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        int[] vetorSoma = {1, 5, 6, 7};

        System.out.printf("Soma 1 = %d %n", calc.soma(1, 2));
        System.out.printf("Soma 2 = %d %n", calc.soma(1, 7, 5));
        System.out.printf("Soma 3 = %.2f %n", calc.soma(3.0, 4.0));
        System.out.printf("Soma 4 = %d %n", calc.soma(vetorSoma));

    }
}
