package com.loiane.cursojava.aula46;

public class BancoMySQL implements BancoDados {

    @Override
    public void grant(String access) {
        System.out.printf("Privilégios de %s concedidos com sucesso. %n", access);
    }

    @Override
    public void revoke(String access) {
        System.out.printf("Privilégios de %s revogados com sucesso. %n", access);
    }

    @Override
    public void select(String querry) {
        System.out.println("Executando querry...");
    }

    @Override
    public void insert(String querry) {
        System.out.println("Executando querry...");
    }

    @Override
    public void delete(String querry) {
        System.out.println("Executando querry...");
    }

    @Override
    public void update(String querry) {
        System.out.println("Executando querry...");
    }

    @Override
    public void create(String querry) {
        System.out.println("Executando querry...");
    }

    @Override
    public void alter(String querry) {
        System.out.println("Executando querry...");
    }

    @Override
    public void drop(String querry) {
        System.out.println("Executando querry...");
    }

    @Override
    public void abrirConexao() {
        System.out.println("Conexão com o banco de dados aberta");
    }

    @Override
    public void fecharConexao() {
        System.out.println("Conexão com o banco de dados fechada");
    }

}
