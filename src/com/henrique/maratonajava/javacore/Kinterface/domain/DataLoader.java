package com.henrique.maratonajava.javacore.Kinterface.domain;

public interface DataLoader {

    
    public abstract void load();

    // A interface DataLoader define um contrato para classes que implementam essa interface,
    // exigindo que elas implementem o método load, que é um método abstrato, ou seja, sem implementação.

    default void checkPermission() {
        System.out.println("Verificando permissões...");
        // O método checkPermission é um método default, 
        // que pode ser utilizado por classes que implementam a interface DataLoader,
        // e exibe uma mensagem indicando que as permissões estão sendo verificadas.
    }
}
