package com.loiane.cursojava.aula29;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    public Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_; 
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

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
