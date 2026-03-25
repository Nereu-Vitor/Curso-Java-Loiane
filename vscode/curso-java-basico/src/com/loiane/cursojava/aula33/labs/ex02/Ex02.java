package com.loiane.cursojava.aula33.labs.ex02;

public class Ex02 {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);

        System.err.printf("Saldo da conta %s = R$ %.2f %n", conta.getNumero(), conta.getSaldo());

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
