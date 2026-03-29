package com.loiane.cursojava.aula44;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {
        System.out.println("Gato amamentado");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miar");
    }

    @Override
    public void brincar() {
        System.out.println("Gato alimentado");
    }

    @Override
    public void levarPassear() {
        System.out.println("Levou o gato ao veterinário");
    }

    @Override
    public void alimentar() {
        System.out.println("Chamou o veterinário para o gato");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Brincou com o gato");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Levou o gato para passear");
    }

}
