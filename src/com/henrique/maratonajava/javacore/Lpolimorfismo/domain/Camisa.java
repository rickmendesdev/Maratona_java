package com.henrique.maratonajava.javacore.Lpolimorfismo.domain;

public class Camisa extends Produto {
    public Camisa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void calcularImposto() {
        this.preco += this.preco * 0.05;
    }
}
