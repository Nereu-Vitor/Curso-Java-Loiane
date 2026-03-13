package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);        

        System.out.print("Digite a quantidade de metros que deseja converter: ");
        double metros = scan.nextDouble();

        double centimetros = metros * 100;        
        System.out.println(metros + " metro(s) equivalem a " + centimetros + " centímetro(s).");
        
    }
}
