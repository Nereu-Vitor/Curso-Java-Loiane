package com.loiane.cursojava.aula27.labs.ex02;

public class ContaCorrente {

    public String numero;
    public String agencia;
    public boolean especial;
    public double limiteEspecial;
    public double valorEspecialUsado;
    public double saldo;

    public boolean realizarSaque(double quantiaASacar) {

        if (saldo >= quantiaASacar) {

            saldo -= quantiaASacar;
            return true;
        } else {

            if (especial) {

                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {

                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
    }

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual da conta = R$ %.2f %n", saldo);
    }

    public boolean verficarUsoChequeEspecial() {
       return saldo < 0;
    }
}
