package com.loiane.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args) {
        
        // Seguindo a convenção Java
        int idade = 21;
        String nome = "Nereu";
        String nomeDoMeuCachorro = "totó";
        String ano2014 = "2014";

        // Aceito, mas não utilizado
        int _idade;
        int $idade;

        // Não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 25;

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        
        // Má prática
        int a = 10;
        String b = "loiane";

    }

}
