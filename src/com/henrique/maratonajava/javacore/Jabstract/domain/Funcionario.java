package com.henrique.maratonajava.javacore.Jabstract.domain;

public abstract class Funcionario extends Pessoa {
    private String nome;
    protected double salario;
    //PROTECTED: O modificador de acesso protected permite que a variável seja acessada dentro da classe, por classes do mesmo pacote e por subclasses, mesmo que estejam em pacotes diferentes. Isso é útil para permitir que subclasses acessem e modifiquem o salário, enquanto ainda mantém um certo nível de encapsulamento.
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
    }
    @Override
    public void imprimir() {
        System.out.println("imprimindo..");
    }
    
    public abstract void calcularBonus();

}
