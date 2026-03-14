package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do {

            System.out.print("Digite seu nome de usuário: ");
            nomeUser = scan.nextLine();

            System.out.print("Digite sua senha: ");
            senha = scan.next();

            if (senha.equalsIgnoreCase(nomeUser)) {
                System.out.println("A senha não pode ser o nome de usuário. Digite novamente suas credenciais!");
            } else {
                System.out.println("Usuário Logado!");
                infoValidas = true;
            }
        
        } while (!infoValidas);        
    }
}
