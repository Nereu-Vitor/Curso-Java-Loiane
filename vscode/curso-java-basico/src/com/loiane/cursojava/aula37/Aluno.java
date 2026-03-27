package com.loiane.cursojava.aula37;

public class Aluno extends Pessoa {

    private String nomeCurso;
    private double[] notas;

    public Aluno() {
        this("Sem Nome", "Sem Endereço", "00 00000-0000", "000.000.000-00", "00 00000-0000", "Sem Curso");
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String nomeCurso) {
        super(nome, endereco, telefone, cpf, telefoneCelular);
        this.setNomeCurso(nomeCurso);
        this.setNotas(new double[4]);
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
        return 0.0;
    }

    public boolean verificarAprovado() {
        return true;
    }

}
