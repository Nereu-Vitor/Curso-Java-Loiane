package com.loiane.cursojava.aula35.labs.ex01;

public class Ex01 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 50; i++) {
            System.out.printf("%d -> ", Fibonacci.gerarFibonacci(i));            
        }

        System.out.println(" Fim");
    }
}
