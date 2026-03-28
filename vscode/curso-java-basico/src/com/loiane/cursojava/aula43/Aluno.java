package com.loiane.cursojava.aula43;

import java.util.Arrays;

public class Aluno {

    private String nomeCurso;
    private double[] notas;

    public Aluno() {
        this("Sem Nome", "Sem Endereço", "00 00000-0000", "000.000.000-00", "00 00000-0000", "Sem Curso",
                new double[4]);
    }

    public Aluno(String nome, String s, String telefone, String cpf, String telefoneCelular, String nomeCurso,
            double[] notas) {
        // super(nome, s, telefone, cpf, telefoneCelular); - Não é possível herdar de
        // uma classe final
        this.setNomeCurso(nomeCurso);
        this.setNotas(notas);
    }

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

    // @Override
    public String obterEtiquetaEndereco() {

        String s = "Endereço do Aluno: ";
        // s += super.getEndereco();

        return s;
    }

    // @Override
    public void imprimirEtiquetaEndereco() {
        System.out.printf("%s %n", this.obterEtiquetaEndereco());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        
        Aluno other = (Aluno) obj;
        
        if (nomeCurso.equalsIgnoreCase(other.getNomeCurso())) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Aluno [nomeCurso=" + nomeCurso + ", notas=" + Arrays.toString(notas) + "]";
    }

    /*
     * @Override
     * public String toString() {
     * 
     * String s = "Nome do Curso = " + nomeCurso + "\n";
     * s += "Notas = ";
     * 
     * for (double nota : notas) {
     * s += nota + " ";
     * }
     * 
     * return s;
     * }
     */

}
