package com.loiane.cursojava.aula27.labs.ex02;

public class Ex02 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500.00;
        conta.saldo = -10;

        conta.consultarSaldo();

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.printf("Saque efetuado com sucesso!%n");
            conta.consultarSaldo();
        } else {
            System.out.printf("Não foi possível realizar saque. Saldo insuficiente %n");
        }

        saqueEfetuado = conta.realizarSaque(500);

        System.out.println("Tentativa de saque de 500 reais");

        if (saqueEfetuado) {
            System.out.printf("Saque efetuado com sucesso!%n");
            conta.consultarSaldo();
        } else {
            System.out.printf("Não foi possível realizar saque. Saldo insuficiente %n");
        }

        System.out.println("Depósito de 500 reais");

        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verficarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        saqueEfetuado = conta.realizarSaque(600);
        conta.consultarSaldo();

        if (conta.verficarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}
