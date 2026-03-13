package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);        

        System.out.print("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é " + area + "m²");
    }
}
