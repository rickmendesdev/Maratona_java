package com.henrique.maratonajava.javacore.Cintroduçãoconstrutores.domain;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(){
        this.nome = "Não informado";
        this.preco = 0.00;
        this.estoque = 0;
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }
    public Produto(String nome, int estoque, double preco){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.estoque);
    }

}
