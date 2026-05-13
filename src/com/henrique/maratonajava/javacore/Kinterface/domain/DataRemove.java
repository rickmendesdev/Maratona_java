package com.henrique.maratonajava.javacore.Kinterface.domain;

public interface DataRemove {
    public static final int MAX_SIZE = 1024;
    // O atributo MAX_SIZE é uma constante, que pode ser acessada diretamente na interface DataRemove, e tem o valor 1024.
    public static  void remove() {
        System.out.println("Removendo oque foi selecionado...");
        // O método remove é um método estático, que pode ser chamado diretamente na interface DataRemove, e exibe uma mensagem indicando que os dados estão sendo removidos.
    }
}
