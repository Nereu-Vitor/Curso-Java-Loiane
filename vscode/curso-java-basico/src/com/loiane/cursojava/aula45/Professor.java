package com.loiane.cursojava.aula45;

public class Professor extends Pessoa {

    private String nomeCurso;
    private double salario;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {

        if (salario > 5000) {
            return salario * 0.8;
        }

        return salario * 0.9;
    }

    @Override
    public String obterEtiquetaEndereco() {
        
        String s = "Endereço do Professor: ";
        s += super.getEndereco();

        return s;
    }

}
