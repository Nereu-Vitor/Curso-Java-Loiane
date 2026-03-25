package com.loiane.cursojava.aula34.labs.ex01;

public class Ex01 {

    private static void imprimirValor() {
        System.out.printf("Valor do contador = %d %n", Contador.obterValor());
    }

    public static void main(String[] args) {

        imprimirValor();
        
        Contador.incrementar();
        
        imprimirValor();
        
        Contador.zerar();
        
        imprimirValor();
        
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();
        
    }
}
