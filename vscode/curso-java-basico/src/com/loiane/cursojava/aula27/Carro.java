package com.loiane.cursojava.aula27;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.printf("A autonomia do carro é %.2f km %n", (capCombustivel * consumoCombustivel));    
    }

    public double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    public double calcaularCombustivel(double km) {

        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
