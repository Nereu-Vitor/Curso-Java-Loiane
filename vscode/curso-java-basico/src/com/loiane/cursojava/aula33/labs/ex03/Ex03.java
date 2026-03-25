package com.loiane.cursojava.aula33.labs.ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);    
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(scan.next());
        
        System.out.print("Digite o nome do curso: ");
        aluno.setNomeCurso(scan.next());

        System.out.print("Digite a matrícula: ");
        aluno.setMatricula(scan.next());

        // aluno.nomesDisciplinas = new String[3];
        for (int i = 0; i < aluno.getNomesDisciplinas().length; i++) {        

            System.out.printf("Digite o nome da %d° disicplina: ", (i + 1));
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {

            System.out.printf("Obtendo notas da disicplina %s %n", aluno.getNomesDisciplinas()[i]);

            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                
                System.out.printf("Digite a %d° nota: ", (j + 1));
                aluno.setNotaDisciplinaPosIJ(i, j, scan.nextDouble());
            }            
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getNomesDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.printf("Disciplina %s - foi aprovado%n", aluno.getNomesDisciplinas()[i]);
            } else {
                System.out.printf("Disciplina %s - foi reprovado%n", aluno.getNomesDisciplinas()[i]);
            }
        }
    }
}
