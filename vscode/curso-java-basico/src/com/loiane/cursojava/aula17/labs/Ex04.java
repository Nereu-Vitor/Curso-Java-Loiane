package com.loiane.cursojava.aula17.labs;

public class Ex04 {

    public static void main(String[] args) {
        

        int popA = 80000, popB = 200000;
        int anos = 0;

        while (popA <= popB) {
            popA += (popA * 3 / 100);
            popB += (popB * 1.5 / 100);
            anos++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de Anos: " + anos);

    }
}
