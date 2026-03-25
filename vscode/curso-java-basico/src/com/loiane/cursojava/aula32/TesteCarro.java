package com.loiane.cursojava.aula32;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro van = new Carro();

        van.setMarca("Fiat");

        System.out.printf("Marca = %s %n", van.getMarca());

    }
}
