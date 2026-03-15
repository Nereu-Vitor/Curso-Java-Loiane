package com.loiane.cursojava.aula17.labs;

public class Ex16 {

    public static void main(String[] args) {

        int termo1 = 0;
        int termo2 = 1;
        int termo3;

        System.out.print(termo1 + " -> " + termo2 + " -> ");

        boolean alcancou = false;
        do {

            termo3 = termo1 + termo2;
                        
            System.out.print(termo3 + " -> ");
            
            if (termo3 > 500) {
                alcancou = true;
            }

            termo1 = termo2;
            termo2 = termo3;

        } while (!alcancou);

        System.out.println("FIM");
    }
}
