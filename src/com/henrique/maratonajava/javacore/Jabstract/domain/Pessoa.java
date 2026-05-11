package com.henrique.maratonajava.javacore.Jabstract.domain;

public abstract class Pessoa {
    public abstract void imprimir();
    // A classe Pessoa é declarada como abstrata, 
    // o que significa que ela não pode ser instanciada diretamente, 
    // e serve apenas como base para outras classes (como Funcionario, Gerente, etc.) 
    // que irão herdar seus métodos e atributos. O método imprimir é declarado como abstrato, 
    // o que obriga as subclasses a fornecerem uma implementação concreta para esse método, 
    // garantindo que cada tipo de pessoa tenha sua própria forma de se imprimir.
}
