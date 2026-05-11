package com.henrique.maratonajava.javacore.Ienum.domain;

public class Cliente {
    // Atributos do cliente
   
    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoCliente tipoCliente;
// Construtor do cliente
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
        this.tipoCliente = tipoCliente;
        
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                ", tipoCliente="  + tipoCliente.getDescricao() +
                ", valor do tipo cliente=" + tipoCliente.getValor() +
                '}';
    }
}