package com.loiane.cursojava.aula43.labs.ex01;

public class ContaBancaria {

    private String nomeCiente;
    private String numConta;
    protected double saldo;

    public ContaBancaria() {
        this("Cliente Não Resgistrado", "00000", 0.0);
    }

    public ContaBancaria(String nomeCiente, String numConta, double saldo) {
        this.nomeCiente = nomeCiente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCiente() {
        return nomeCiente;
    }

    public void setNomeCiente(String nomeCiente) {
        this.nomeCiente = nomeCiente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {

        String s = "ContaBancaria[ ";
        s += "nomeCiente: " + nomeCiente + "; ";
        s += "numConta: " + numConta + "; ";
        s += "saldo: " + saldo;
        s += "]";

        return s;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {

        if ((saldo - valor) > 0) {
            saldo -= valor;
            return true;
        }

        return false;
    }
}
