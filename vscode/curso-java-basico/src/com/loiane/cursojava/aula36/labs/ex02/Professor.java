package com.loiane.cursojava.aula36.labs.ex02;

public class Professor {

    private String nome;
    private String departamento;
    private String email;

    public Professor() {
        this("Sem Nome", "Padrão", "Sem Email");
    }

    public Professor(String nome, String departamento, String email) {
        this.setNome(nome);
        this.setDepartamento(departamento);
        this.setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo() {
        String info = "Nome do Professor = " + nome +
                " - Departamento = " + departamento +
                " - Email = " + email + "\n";

        return info;
    }
}
