package com.loiane.cursojava.aula43;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNomeCurso("Ciência da Computação");

        double[] notas = { 10.0, 9.0, 8.0, 7.0 };
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "asdcfdv";        
        String s2 = "asdcfdv";
        
        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setNomeCurso("Ciência da Computação");

        double[] notas2 = { 10.0, 9.5, 6.0, 7.0 };
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }
}
