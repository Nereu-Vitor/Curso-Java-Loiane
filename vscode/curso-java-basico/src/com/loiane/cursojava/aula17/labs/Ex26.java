package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex26 {
 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("Fatorial de: " + num);
        System.out.print(num + "! = ");

        long fatorial = 1;

        for (int i = num; i > 1; i--) {
            System.out.print(i + " . ");
            fatorial *= i;
        }

        System.out.println("1 = " + fatorial);
    }
}
