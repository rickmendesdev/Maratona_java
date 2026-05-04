package com.henrique.maratonajava.javacore.Heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome); // Chama o construtor da classe mãe (Pessoa)
    }
    
    //sobrescreve o método imprime da classe Pessoa
    // O metodo super é utilizado para chamar o método da classe mãe

    public void relatorioPagamento() {
        System.out.println("Relatório de pagamento do funcionário: " + this.nome);
        // Só consigo usar o nome porque ele é protected, se fosse private eu não conseguiria acessar o nome da classe mãe, mesmo utilizando o método super.
    }
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
