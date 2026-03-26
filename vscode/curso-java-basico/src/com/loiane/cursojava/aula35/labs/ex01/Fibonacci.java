package com.loiane.cursojava.aula35.labs.ex01;

public class Fibonacci {

    public static int gerarFibonacci(int num) {

        if (num < 2) {
            return 1;
        }

        return gerarFibonacci(num - 1) + gerarFibonacci(num - 2);
    }
}
