package com.henrique.maratonajava.javacore.Bintroducaometodos.test;

import com.henrique.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
     double result = calculadora.dividir(30, 2);
    System.out.println(result);
    
    }
}
