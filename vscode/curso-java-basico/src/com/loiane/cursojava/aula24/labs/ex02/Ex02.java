package com.loiane.cursojava.aula24.labs.ex02;

public class Ex02 {

    public static void main(String[] args) {
        
        Livro livro = new Livro();
        livro.nome = "Mastering ExtJS";        
        livro.autor = "Loiane Groner";        
        livro.anoLancamento = 2015;        

        System.out.printf("Nome do livro = %s %n", livro.nome);
        System.out.printf("Autor(a) do livro = %s %n", livro.autor);
        System.out.printf("Ano de lançamento do livro = %d %n", livro.anoLancamento);
    }
}
