package com.loiane.cursojava.aula25;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.printf("A autonomia do carro é %.2f km %n", (capCombustivel * consumoCombustivel));    
    }

}
