package com.loiane.cursojava.aula43.labs.ex01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca() {
        this("Cliente Não Resgistrado", "00000", 0.0, 0);
    }

    public ContaPoupanca(String nomeCiente, String numConta, double saldo, int diaRendimento) {
        super(nomeCiente, numConta, saldo);
        this.setDiaRendimento(diaRendimento);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {

        String s = "ContaPoupanca[ ";
        s += "diaRendimento: " + diaRendimento + "; ";
        s += super.toString();
        s += "]";

        return s;
    }    

    public boolean calcularNovoSaldo(double taxaRendimento) {

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {            

            this.saldo += (saldo * taxaRendimento);

            return true;
        } 

        return false;
    }

}
