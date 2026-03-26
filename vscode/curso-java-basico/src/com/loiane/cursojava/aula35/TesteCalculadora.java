package com.loiane.cursojava.aula35;

public class TesteCalculadora {

    public static void main(String[] args) {
        
        long fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.printf("Fatorial não recursivo = %d %n", fatorialNR);
        
        long fatorialR = Calculadora.fatorialRecursivo(5);
        System.out.printf("Fatorial recursivo = %d %n", fatorialR);
    }
}
