package com.loiane.cursojava.aula43.labs.ex01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {

        String s = "ContaEspecial[ ";
        s += "limite: " + limite + "; ";
        s += super.toString();
        s += "]";

        return s;
    }

    @Override
    public boolean sacar(double valor) {

        double saldoComLimite = this.saldo + limite;

        if (saldoComLimite - valor > 0) {
            this.saldo = this.saldo - valor;
            return true;
        }

        return false;
    }

}
