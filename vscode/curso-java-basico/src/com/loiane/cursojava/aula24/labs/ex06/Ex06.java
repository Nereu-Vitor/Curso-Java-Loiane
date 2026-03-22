package com.loiane.cursojava.aula24.labs.ex06;

public class Ex06 {

    public static void main(String[] args) {
        
        Contato contato1 = new Contato();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@gmail.com";
        contato1.telefones = new String[3];
        contato1.telefones[0] = "99999-9999";
        contato1.telefones[1] = "99999-9998";
        contato1.telefones[2] = "99999-9997";

        System.out.printf("Nome = %s %n", contato1.nome);        
        System.out.printf("Email = %s %n", contato1.email);        
        System.out.printf("Endereço = %s %n", contato1.endereco);    

        System.out.printf("Telefones = ");              
        for (String telefone : contato1.telefones) {
            System.out.printf("%s | ", telefone);            
        }        

        System.out.println();
    }
}
