package com.loiane.cursojava.aula36.labs.ex02;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno() {
        this("Sem Nome", "00000000", new double[4]);
    }

    public Aluno(String nome, String matricula, double[] notas) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setNotas(notas);
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo() {
        String info = "Nome do Aluno = " + nome +
                " - Matrícula = " + matricula +
                " - Notas: ";

        for (double nota : notas) {
            info += nota + " ";
        }

        double media = obterMedia();
        info += "\n" + " - Média = " + media + " - ";
        
        if (media >= 7) {
            info += "Aprovado!\n";
        } else {
            info += "Reprovado!\n";
        }   
        
        return info;
    }

    public double obterMedia() {
        double soma = 0.0;

        for (double nota : notas) {
            soma += nota;            
        }
        
        double media = soma / notas.length;
        
        return media;
    }
    
}
