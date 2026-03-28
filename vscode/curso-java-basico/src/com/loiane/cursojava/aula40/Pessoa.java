package com.loiane.cursojava.aula40;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String telefoneCelular;

    public Pessoa() {
        this("Sem Nome", "Sem Endereço", "00 00000-0000", "000.000.000-00", "00 00000-0000");
    }

    public Pessoa(String nome, String endereco, String telefone, String cpf, String telefoneCelular) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setCpf(cpf);
        this.setTelefoneCelular(telefoneCelular);        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String obterEtiquetaEndereco() {
        return endereco;
    }

}
