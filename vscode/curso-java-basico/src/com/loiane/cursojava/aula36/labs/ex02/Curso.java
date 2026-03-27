package com.loiane.cursojava.aula36.labs.ex02;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {
        this("Sem Nome", "Sem Horário", new Professor(), new Aluno[5]);
    }

    public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
        this.setNome(nome);
        this.setHorario(horario);
        this.setProfessor(professor);
        this.setAlunos(alunos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo() {
        String info = "Nome do Curso = " + nome +
                " - Horário = " + horario + "\n";

        if (professor != null) {
            info += professor.obterInfo();
        }

        if (alunos != null) {

            for (Aluno aluno : alunos) {
                
                if (aluno != null) {
                    info += aluno.obterInfo();                    
                }
            }
        }

        info += "\n - Média da Turma = " + obterMediaTurma();

        return info;
    }

    private double obterMediaTurma() {

        double soma = 0.0;
        for (Aluno aluno : alunos) {     
            
            if (aluno != null) {
                soma += aluno.obterMedia();                     
            }
        }

        return soma / alunos.length;        
    }

}
