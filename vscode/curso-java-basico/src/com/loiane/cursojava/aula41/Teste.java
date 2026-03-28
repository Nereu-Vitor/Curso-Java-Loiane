package com.loiane.cursojava.aula41;

public class Teste {

    public static void main(String[] args) {
        
        // Pessoa pessoa = new Pessoa(); Não pode ser instanciada por ser Abstrata
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        // pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
