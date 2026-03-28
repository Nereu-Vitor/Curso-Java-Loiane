package com.loiane.cursojava.aula43.labs.ex01;

public class Ex01 {

    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCiente("Cliente Conta Simples");
        contaSimples.setNumConta("11111");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);
        
        realizarSaque(contaSimples, 70);

        System.out.printf("Informações conta simples: %s %n", contaSimples.toString());

        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCiente("Cliente Conta Poupanca");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(29);

        
        contaPoupanca.depositar(100);
        
        realizarSaque(contaPoupanca, 50);
        
        realizarSaque(contaPoupanca, 70);
        
        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.printf("Rendimento aplicado, novo saldo é de R$ %.2f %n", contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }

        System.out.printf("Informações conta popupança: %s %n", contaPoupanca.toString());

        System.out.println("*** Teste ContaBancaria ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCiente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);
        
        realizarSaque(contaEspecial, 70);

        realizarSaque(contaEspecial, 80);

        System.out.printf("Informações conta especial: %s %n", contaEspecial.toString());

    }

    private static void realizarSaque(ContaBancaria conta, double valor) {

        if (conta.sacar(valor)) {
            System.out.printf("Saque efetuado com sucesso, novo saldo = R$ %.2f %n", conta.getSaldo());
        } else {
            System.out.printf("Saldo insuficiente para saque R$ %.2f, saldo de = R$ %.2f %n", valor, conta.getSaldo());
        }

    }
}
