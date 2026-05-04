package com.henrique.maratonajava.javacore.Heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected Endereço endereço;

// A utilização do protected é para que as classes filhas possam acessar os atributos da classe mãe
// sem a necessidade de utilizar os métodos get e set, ou seja, sem a necessidade de encapsulamento.


    public Pessoa(String nome) {
        this.nome = nome;
    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.idade);
        System.out.println(this.endereço.getRua());
        System.out.println(this.endereço.getCep());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Endereço getEndereço() {
        return endereço;
    }
    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
    
    
}
