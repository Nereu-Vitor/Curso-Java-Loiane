package com.loiane.cursojava.aula27.labs.ex03;

public class Aluno {

    public String nome;
    public String matricula;
    public String nomeCurso;
    public String[] nomesDisciplinas = new String[3];
    public double[][] notasDisciplinas = new double[3][4];

    public void mostrarInfo() {
        
        System.out.printf("Nome: %s %n", nome);
        System.out.printf("Matrícula: %s %n", matricula);
        System.out.printf("Nome do curso: %s %n", nomeCurso);

        for (int i = 0; i < nomesDisciplinas.length; i++) {

            System.out.printf("Notas da disciplina %s: ", nomesDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.printf("%.1f ", notasDisciplinas[i][j]);

            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice) {

        if (obterMedia(indice) >= 7.0) {
            return true;
        }

        return false;
    }

    public double obterMedia(int indice) {
        double soma = 0.0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }
}
