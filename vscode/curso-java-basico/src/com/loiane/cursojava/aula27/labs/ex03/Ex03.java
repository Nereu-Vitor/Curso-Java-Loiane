package com.loiane.cursojava.aula27.labs.ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);    
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scan.next();
        
        System.out.print("Digite o nome do curso: ");
        aluno.nomeCurso = scan.next();

        System.out.print("Digite a matrícula: ");
        aluno.matricula = scan.next();

        // aluno.nomesDisciplinas = new String[3];
        for (int i = 0; i < aluno.nomesDisciplinas.length; i++) {        

            System.out.printf("Digite o nome da %d° disicplina: ", (i + 1));
            aluno.nomesDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {

            System.out.printf("Obtendo notas da disicplina %s %n", aluno.nomesDisciplinas[i]);

            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                
                System.out.printf("Digite a %d° nota: ", (j + 1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }            
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomesDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.printf("Disciplina %s - foi aprovado%n", aluno.nomesDisciplinas[i]);
            } else {
                System.out.printf("Disciplina %s - foi reprovado%n", aluno.nomesDisciplinas[i]);
            }
        }
    }
}
