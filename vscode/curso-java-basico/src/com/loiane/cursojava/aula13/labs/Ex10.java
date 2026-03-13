package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scan.nextDouble();

        double temperaturaFarenheit = ((temperaturaCelsius * 1.8) + 32);
        System.out.println(temperaturaCelsius + "°C equivalem a " + temperaturaFarenheit + "°F");
    }
}
