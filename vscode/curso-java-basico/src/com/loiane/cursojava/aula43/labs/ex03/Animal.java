package com.loiane.cursojava.aula43.labs.ex03;

public class Animal {

    protected String nome;
    protected double comprimento;
    protected int numPatas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;
    protected String caracteristicas;

    public Animal() {
        this.numPatas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {

        String s = "Animal: " + nome + "\n" +
                "Comprimento: " + comprimento + " cm\n" +
                "Patas: " + numPatas + "\n" +
                "Cor: " + cor + "\n" +
                "Ambiente" + ambiente + "\n" +
                "Velocidade: " + velocidade + " m/s";

        return s;
    }

}
