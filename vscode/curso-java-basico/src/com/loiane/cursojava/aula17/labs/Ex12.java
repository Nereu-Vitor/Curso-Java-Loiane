package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
