package com.loiane.cursojava.aula36.labs.ex01;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public Agenda(String nome) {
        this.nome = nome;
    }

    public Agenda() {

    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String obterInfo() {
        String info = "Nome da Agenda = " + nome + "\n" +
                "Contatos: \n";

        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.obterInfo() + "\n";
            }
        }

        return info;
    }

}
