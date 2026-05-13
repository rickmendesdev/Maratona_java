package com.henrique.maratonajava.javacore.Kinterface.domain;

public class DataBaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um banco de dados...");
        // O método load é implementado na classe DataBaseLoader, e exibe uma mensagem indicando que os dados estão sendo carregados de um banco de dados.
    }
    
}
