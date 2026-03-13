package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu sexo(F ou M): ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");             
        } else if (sexo.equalsIgnoreCase("m")) {            
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");        
        }
    }
}
