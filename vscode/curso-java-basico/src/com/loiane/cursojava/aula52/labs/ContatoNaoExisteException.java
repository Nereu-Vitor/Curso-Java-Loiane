package com.loiane.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception {

    private String nomeContato;

    public ContatoNaoExisteException(String nome) {
        super();
        this.nomeContato = nome;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " não existe na agenda";
    }
}
