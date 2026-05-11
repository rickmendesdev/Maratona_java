package com.henrique.maratonajava.javacore.Jabstract.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        // A classe Desenvolvedor é uma subclasse de Funcionario, e herda os atributos e métodos da classe Funcionario. O construtor da classe Desenvolvedor chama o construtor da classe Funcionario usando a palavra-chave super, passando os parâmetros nome e salario para inicializar os atributos herdados.
    }
    @Override 
    public void calcularBonus() {
        // O método calcularBonus é implementado na classe Desenvolvedor
        this.salario += this.salario * 0.1; 
        // O bônus é calculado como 10% do salário atual, e adicionado ao salário do desenvolvedor.
    }
}
