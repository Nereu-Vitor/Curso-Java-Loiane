package com.loiane.cursojava.aula24.labs.ex03;

public class Ex03 {

    public static void main(String[] args) {
        
        LivroLivraria livro = new LivroLivraria();
        livro.nome = "Mastering ExtJS";        
        livro.autor = "Loiane Groner";        
        livro.anoLancamento = 2015;        
        livro.preco = 63.39;

        System.out.printf("Nome do livro = %s %n", livro.nome);
        System.out.printf("Autor(a) do livro = %s %n", livro.autor);
        System.out.printf("Ano de lençamento do livro = %d %n", livro.anoLancamento);
        System.out.printf("Preço do livro = R$ %.2f %n", livro.preco);
    }
}
