package com.loiane.cursojava.aula40;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

        System.out.printf("%s %n", pessoa.obterEtiquetaEndereco());
        System.out.printf("%s %n", aluno.obterEtiquetaEndereco());
        System.out.printf("%s %n", professor.obterEtiquetaEndereco());
    }
}
