package com.loiane.cursojava.aula43.labs.ex02;

public abstract class Contribuinte {

    private String nome;
    protected double rendaBruta;

    public Contribuinte() {
        this("Não Registrado", 0.0);
    }

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public String toString() {

        String s = "Nome: " + nome + "; ";
        s += "Renda Bruta:  R$ " + rendaBruta;

        return s;
    }

    public abstract double calcularImposto();

}
