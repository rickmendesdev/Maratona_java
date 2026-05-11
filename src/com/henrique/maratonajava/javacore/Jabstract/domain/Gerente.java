package com.henrique.maratonajava.javacore.Jabstract.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calcularBonus() {
        this.salario += this.salario * 0.15;
    }
}
