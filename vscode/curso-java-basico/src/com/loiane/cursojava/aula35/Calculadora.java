package com.loiane.cursojava.aula35;

public class Calculadora {

    public static long fatorialNaoRecursivo(int num) {

        if (num == 0) {
            return 1;
        }

        long total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }

        return total;
    }

    public static long fatorialRecursivo(int num) {

        if (num == 0) {
            return 1;
        }

        return num * fatorialNaoRecursivo(num - 1);
    }

}
