package com.loiane.cursojava.aula43.labs.ex03;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super();
        this.cor = "Castanho";
        this.ambiente = "Terra";
        this.alimento = "Mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Alimento: " + alimento;
    }
}
