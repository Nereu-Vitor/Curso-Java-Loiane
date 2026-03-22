package com.loiane.cursojava.aula26;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.printf("%s %n", van.marca);
        System.out.printf("%s %n", van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.printf("Autonomia do carro é: %.2f %n", autonomia);
        System.out.printf("Autonomia do carro é: %.2f %n", van.obterAutonomia());
    }
}
