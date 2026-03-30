package com.loiane.cursojava.aula52.labs;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {

            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
        }

        if (cheia) {
            throw new AgendaCheiaException();
        }
    }

    public int consultarContato(String nome) throws ContatoNaoExisteException {

        for (int i = 0; i < contatos.length; i++) {

            if (contatos[i] != null) {

                if (contatos[i].getNome().equalsIgnoreCase(nome)) {

                    return i;
                }
            }
        }

        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {

        String s = "";
        for (Contato contato : contatos) {
            if (contato != null) {                
                s += contato.toString() + "\n";
            }
        }

        return s;
    }

}
