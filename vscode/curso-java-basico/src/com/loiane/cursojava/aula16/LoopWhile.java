package com.loiane.cursojava.aula16;

public class LoopWhile {

    public static void main(String[] args) {
        
        int i = 1; // count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println(i);
            i++;
        }

        System.out.println(i);

        do {
            i++;
            System.out.println(i);
        } while (i < 12);

        System.out.println(i);
    }
}
