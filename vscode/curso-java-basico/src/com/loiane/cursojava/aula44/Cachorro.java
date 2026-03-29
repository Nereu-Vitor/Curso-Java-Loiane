package com.loiane.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raca;
    private double tamanho;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void amamentar() {
        System.out.println("Cachorro amamentado");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latir");
    }

    @Override
    public void alimentar() {
        System.out.println("Cachorro alimentado");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Levou o cachorro ao veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamou o veterinário para o cachorro");
    }

    @Override
    public void brincar() {
        System.out.println("Brincou com o cachorro");
    }

    @Override
    public void levarPassear() {
        System.out.println("Levou o cachorro para passear");
    }

}
