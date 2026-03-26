package com.loiane.cursojava.aula34.labs.ex02;

public class Calculadora {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    
    public static double dividir(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static double exponenciar(int num1, int num2) {
        return Math.pow(num1, num2);
    }

}
