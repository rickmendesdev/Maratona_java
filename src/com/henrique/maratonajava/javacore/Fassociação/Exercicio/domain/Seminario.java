package com.henrique.maratonajava.javacore.Fassociação.Exercicio.domain;

public class Seminario {
    private String titulo;
    private Professor professor;
    private Aluno [] alunos;
    private Local local;

    
    public Seminario(String titulo, Professor professor, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.alunos = alunos;
        this.local = local;
    }
    public void imprime() {
        System.out.println(this.titulo);
        if(this.professor != null) {
            System.out.println(this.professor.getNome());
        }
        if(this.alunos != null) {
            for(Aluno aluno : this.alunos) {
                System.out.println(aluno.getNome());
            }
        }
        if(this.local != null) {
            System.out.println(this.local.getEndereco());
        }
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }
    
}
