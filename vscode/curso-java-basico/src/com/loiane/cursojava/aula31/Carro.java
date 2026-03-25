package com.loiane.cursojava.aula31;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.printf("A autonomia do carro é %.2f km %n", (capCombustivel * consumoCombustivel));
    }

    public double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    private double dividirKMPorConsumoCombustivel(double km) {
        return km / consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        
        return dividirKMPorConsumoCombustivel(km);        
    }

}
