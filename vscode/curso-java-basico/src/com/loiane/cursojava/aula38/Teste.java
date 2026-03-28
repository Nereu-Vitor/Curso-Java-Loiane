package com.loiane.cursojava.aula38;

public class Teste {

    public static void main(String[] args) {
        
        System.out.println("------- Pessoas -------");
        Pessoa pessoa1 = new Pessoa("João", "Av. Brasil, 100", "+55 11 98755-9844", "192.930.498-78",
        "Não Possui Telefone Celular");

        exibirInformacoes(pessoa1);

        Pessoa pessoa2 = new Pessoa();       

        exibirInformacoes(pessoa2);

        System.out.println("------- Alunos -------");
        
        Aluno aluno1 = new Aluno("Mario", "Rua das Flores, 10", "Não Possui Telefone", "202.345.567-90",
        "+55 87 99999-9999", "ADS", new double[] {5.5, 6.5, 7.5, 8.5});
        
        exibirInformacoes(aluno1);

        Aluno aluno2 = new Aluno();
        
        exibirInformacoes(aluno2);
        
        
        System.out.println("------- Professores -------");

        Professor professor1 = new Professor("José Lucas", "Av. Flores do Sertão, 21", "98 89764-0987", "123.456.789.10", "+55 11 98765-4321", "ADS", 5987.45);

        exibirInformacoes(professor1);

        Professor professor2 = new Professor();

        exibirInformacoes(professor2);
    }

    private static void exibirInformacoes(Pessoa pessoa) {

        System.out.println("Informações da Pessoa:");
        System.out.printf("Nome = %s %n", pessoa.getNome());
        System.out.printf("Endereço = %s %n", pessoa.getEndereco());
        System.out.printf("Telefone = %s %n", pessoa.getTelefone());
        System.out.printf("CPF = %s %n", pessoa.getCpf());
        System.out.printf("Telefone Celular = %s %n", pessoa.getTelefoneCelular());
    }

    private static void exibirInformacoes(Aluno aluno) {

        System.out.println("Informações do Aluno:");
        System.out.printf("Nome = %s %n", aluno.getNome());
        System.out.printf("Endereço = %s %n", aluno.getEndereco());
        System.out.printf("Telefone = %s %n", aluno.getTelefone());
        System.out.printf("CPF = %s %n", aluno.getCpf());
        System.out.printf("Telefone Celular = %s %n", aluno.getTelefoneCelular());
        System.out.printf("Nome do Curso = %s %n", aluno.getNomeCurso());

        System.out.print("Notas = ");
        for (double nota : aluno.getNotas()) {
            System.out.printf("%.1f ", nota);
        }
        System.out.println();

        System.out.printf("Média = %.1f %n", aluno.calcularMedia());

        System.out.printf("Situação = %s %n", aluno.verificarAprovado() ? "Aprovado" : "Reprovado");
    }

    private static void exibirInformacoes(Professor professor) {

        System.out.println("Informações do Professor:");
        System.out.printf("Nome = %s %n", professor.getNome());
        System.out.printf("Endereço = %s %n", professor.getEndereco());
        System.out.printf("Telefone = %s %n", professor.getTelefone());
        System.out.printf("CPF = %s %n", professor.getCpf());
        System.out.printf("Telefone Celular = %s %n", professor.getTelefoneCelular());
        System.out.printf("Nome do Curso = %s %n", professor.getNomeCurso());
        System.out.printf("Salário Bruto = R$ %.2f %n", professor.getSalario());
        System.out.printf("Salário Liquído = R$ %.2f %n", professor.calcularSalarioLiquido());
    }
}
