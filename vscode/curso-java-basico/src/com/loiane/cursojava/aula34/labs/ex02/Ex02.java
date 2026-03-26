package com.loiane.cursojava.aula34.labs.ex02;

public class Ex02 {

    public static void main(String[] args) {

        imprimirTela(Calculadora.somar(1, 2));
        
        imprimirTela(Calculadora.subtrair(2, 1));

        imprimirTela(Calculadora.multiplicar(2, 2));
        
        imprimirTela(Calculadora.dividir(4, 2));

        imprimirTela(Calculadora.exponenciar(2, 4));

    }

    private static void imprimirTela(double num) {
        System.out.printf("Resultado = %.2f %n", num);
    }
}
