package com.loiane.cursojava.aula33.labs.ex03;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomesDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomesDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public Aluno() {
        this("Novo Aluno", "Sem Matrícula", "Sistemas para Internet");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomesDisciplinas() {
        return nomesDisciplinas;
    }

    public void setNomesDisciplinas(String[] nomesDisciplinas) {
        this.nomesDisciplinas = nomesDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

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

    private double obterMedia(int indice) {
        double soma = 0.0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }

    public void setNomeDisciplinaPos(int posicao, String nomeDisciplina) {
        nomesDisciplinas[posicao] = nomeDisciplina;
    }

    public void setNotaDisciplinaPosIJ(int posicaoI, int posicaoJ, double notaDisciplina) {
        notasDisciplinas[posicaoI][posicaoJ] = notaDisciplina;
    }

}
