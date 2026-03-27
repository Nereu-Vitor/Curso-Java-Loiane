package com.loiane.cursojava.aula36.labs.ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scan.nextLine();
        
        System.out.print("Digite o horário do curso: ");
        String horarioCurso = scan.nextLine();
        
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scan.nextLine();
        
        System.out.print("Digite o departamento do professor: ");
        String depProfessor = scan.nextLine();
        
        System.out.print("Digite o email do professor: ");
        String emailProfessor = scan.nextLine();

        Professor professor = new Professor(nomeProfessor, depProfessor, emailProfessor);

        System.out.println("----- Alunos -----");
        
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {            

            System.out.printf("Digite o nome do %d° aluno: ", (i + 1));
            String nomeAluno = scan.nextLine();

            System.out.print("Digite a matrícula do ano: ");
            String matriculaAluno = scan.nextLine();

            double[] notasAluno = new double[4];

            for (int j = 0; j < notasAluno.length; j++) {

                System.out.printf("Digite a %d° nota: ", (j + 1));
                notasAluno[j] = scan.nextDouble();

            }

            scan.nextLine();

            Aluno aluno = new Aluno(nomeAluno, matriculaAluno, notasAluno);                      
            alunos[i] = aluno;  
        }

        Curso curso = new Curso(nomeProfessor, horarioCurso, professor, alunos);
        
        System.out.println(curso.obterInfo());

        scan.close();
    }
}
