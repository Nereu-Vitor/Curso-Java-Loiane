package com.loiane.cursojava.aula44;

public class Cavalo extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    @Override
    public void amamentar() {
        System.out.println("Cavalo amamentado");
    }

    @Override
    public void emitirSom() {
        System.out.println("Relinchar");
    }

    @Override
    public void alimentar() {
        System.out.println("Cavalo alimentado");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Levou o cavalo ao veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamou o veterinário para o cavalo");
    }

    @Override
    public void brincar() {
        System.out.println("Brincou com o cavalo");
    }

    @Override
    public void levarPassear() {
        System.out.println("Levou o cavalo para passear");
    }

}
