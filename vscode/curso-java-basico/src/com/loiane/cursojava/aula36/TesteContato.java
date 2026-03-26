package com.loiane.cursojava.aula36;

public class TesteContato {

    public static void main(String[] args) {
        
        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 99999-9999");

        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Game of Thrones");
        endereco.setNumero("n/a");
        endereco.setComplemento("-");
        endereco.setCidade("Kings Landing");
        endereco.setEstado("Westeros");
        endereco.setCep("9999999");

        contato.setEndereco(endereco);

        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("11");
        telefone.setNumero("99999-9999");
        
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("11");
        telefone2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {            
            System.out.printf("Cidade = %s %n", contato.getEndereco().getCidade());
        }
        
        if (contato != null && contato.getTelefones() != null) {

            System.out.println("Telefone(s):");

            for (Telefone t : contato.getTelefones()) {

                System.out.printf("%s %s %n", t.getDdd(), t.getNumero());                
            }
        }
    }
}
