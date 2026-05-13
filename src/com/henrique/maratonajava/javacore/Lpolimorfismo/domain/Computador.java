package com.henrique.maratonajava.javacore.Lpolimorfismo.domain;

public class Computador extends Produto {
    private static final double IMPOSTO = 0.10;
    public Computador(String nome, double preco) {
        super(nome, preco);
    }
    
    @Override
    public void calcularImposto() {
        this.preco += this.preco * IMPOSTO;
    }
    
}
