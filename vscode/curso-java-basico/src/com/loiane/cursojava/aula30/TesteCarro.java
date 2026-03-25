package com.loiane.cursojava.aula30;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro van = new Carro("Fiat", "Ducato");

        System.out.printf("Número de passageiros da van = %d %n", van.numPassageiros);
    }
}
