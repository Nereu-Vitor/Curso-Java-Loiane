package com.loiane.cursojava.aula29;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        // van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.printf("Numero de passageiros da van = %d %n", van.numPassageiros);

        Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);

        System.out.println("Info van2:");
        System.out.printf("Marca = %s %n", van2.marca);
        System.out.printf("Modelo = %s %n", van2.modelo);
        System.out.printf("Número de Passageiros  = %d %n", van2.numPassageiros);
        System.out.printf("Capacidade de Combustível = %.2f %n", van2.capCombustivel);
        System.out.printf("Consumo de Combustível  = %.2f %n", van2.consumoCombustivel);

        Carro2 carro2 = new Carro2();
    }
}
