package com.henrique.maratonajava.javacore.Ienum.domain;
// Enum é uma classe especial que representa um grupo de constantes (variáveis finais estáticas)
// Cada constante é uma instância da enumeração, e pode ter seus próprios atributos e métodos
// Enum é útil para representar um conjunto fixo de valores, como dias da semana, meses do ano, tipos de clientes, etc.
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private final int valor;
    private final String descricao;

    TipoCliente(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
