package com.loiane.cursojava.aula41;

public class Professor extends Pessoa {

    private String nomeCurso;
    private double salario;

    public Professor() {
        this("Sem Nome", "Sem Endereço", "00 00000-0000", "000.000.000-00", "00 00000-0000", "Sem Curso", 0.0);
    }

    public Professor(String nome, String endereco, String telefone, String cpf, String telefoneCelular,
            String nomeCurso, double salario) {
        super(nome, endereco, telefone, cpf, telefoneCelular);
        this.setNomeCurso(nomeCurso);
        this.setSalario(salario);
    }

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

    @Override
    public void imprimirEtiquetaEndereco() {
        
        System.out.println("Imprimindo endereço do Professor");
        System.out.printf("%s %n", this.obterEtiquetaEndereco());

    }

}
