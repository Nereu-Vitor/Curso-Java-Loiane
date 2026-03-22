package com.loiane.cursojava.aula24.labs.ex05;

public class Ex05 {

    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = "123456";
        contaCorrente.agencia = "1234";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500.00;
        contaCorrente.saldo = -10;
        
        System.out.printf("Número = %s %n", contaCorrente.numero);
        System.out.printf("Agência = %s %n", contaCorrente.agencia);
        System.out.printf("Conta espcial? %b %n", contaCorrente.especial);
        System.out.printf("Limite especial = R$ %.2f %n", contaCorrente.limiteEspecial);
        System.out.printf("Saldo da conta = R$ %.2f %n", contaCorrente.saldo);
    }
}
