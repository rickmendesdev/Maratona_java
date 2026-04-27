package com.henrique.maratonajava.javacore.Cintroduçãoconstrutores.domain;

public class Anime {
    private String nome;
    private int ep;
    private String genero;

    public Anime(String nome, int ep, String genero){
        this.nome = nome;
        this.ep = ep;
        this.genero = genero;

    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.ep);
        System.out.println(this.genero);
    } 
    
}
