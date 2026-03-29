package com.loiane.cursojava.aula45;

public class Aluno extends Pessoa {

    private String nomeCurso;
    private double[] notas;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {

        double soma = 0.0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public boolean verificarAprovado() {

        if (calcularMedia() >= 7) {
            return true;
        }

        return false;
    }

    @Override
    public String obterEtiquetaEndereco() {

        String s = "Endereço do Aluno: ";
        s += super.getEndereco();

        return s;
    }

}
