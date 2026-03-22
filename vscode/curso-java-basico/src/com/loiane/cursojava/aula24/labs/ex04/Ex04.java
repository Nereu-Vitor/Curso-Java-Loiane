package com.loiane.cursojava.aula24.labs.ex04;

import java.util.Date;

public class Ex04 {

    public static void main(String[] args) {
        
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.nome = "Mastering ExtJS";        
        livro.autor = "Loiane Groner";        
        livro.anoLancamento = 2015;        

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Nereu";

        System.out.printf("Nome do livro = %s %n", livro.nome);
        System.out.printf("Autor(a) do livro = %s %n", livro.autor);
        System.out.printf("Ano de lençamento do livro = %d %n", livro.anoLancamento);
        System.out.printf("Emprestado? %b %n", livro.emprestado);
        System.out.printf("Data de entrega = %s %n", livro.dataEntrega);
        System.out.printf("Emprestado a = %s %n", livro.emprestadoA);
    }
}
