package com.loiane.cursojava.aula34;

public class TesteMinhaCalculadora {

    private static int resultSoma;
    public static void main(String[] args) {

        resultSoma = MinhaCalculadora.soma(1, 2);

        // MinhaCalculadora calc = new MinhaCalculadora();

        int[] vetorSoma = { 1, 5, 6, 7 };

        System.out.printf("Soma 1 = %d %n", MinhaCalculadora.soma(1, 2));
        System.out.printf("Soma 2 = %d %n", MinhaCalculadora.soma(1, 7, 5));
        System.out.printf("Soma 3 = %.2f %n", MinhaCalculadora.soma(3.0, 4.0));
        System.out.printf("Soma 4 = %d %n", MinhaCalculadora.soma(vetorSoma));

        System.out.printf("Valor do resulSoma = %d %n", resultSoma);
        System.out.printf("Valor do método somaDoisValores = %d %n", somaDoisValores(7, 12));

    }

    private static int somaDoisValores(int num1, int num2) {
        return MinhaCalculadora.soma(num1, num2);
    }

}
