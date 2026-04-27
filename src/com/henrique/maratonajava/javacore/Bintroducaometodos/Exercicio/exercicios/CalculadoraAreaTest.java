package com.henrique.maratonajava.javacore.Bintroducaometodos.Exercicio.exercicios;

import com.henrique.maratonajava.javacore.Bintroducaometodos.Exercicio.dominio.CalculadoraArea;

public class CalculadoraAreaTest {
    public static void main(String[] args) {
        CalculadoraArea ca = new CalculadoraArea();
        System.out.println(ca.calcularArea(8));
        ca.calcularArea(5);
        ca.calcularArea(5, 5);
    }
    
}
