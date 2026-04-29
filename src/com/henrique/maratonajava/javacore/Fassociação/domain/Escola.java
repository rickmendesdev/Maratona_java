package com.henrique.maratonajava.javacore.Fassociação.domain;

public class Escola {
    private String nome;
    private Professor[] professor;

    
    public Escola(String nome , Professor [] professores) {
        this.nome = nome;
        this.professor = professores;
    }
    public void imprime(){

       System.out.println(this.nome);
       if(professor == null){
        return;
       }

       for (Professor professor : professor) {
        System.out.println(professor.getNome());
       }

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Professor[] getProfessor() {
        return professor;
    }
    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }
   

    
    
}
