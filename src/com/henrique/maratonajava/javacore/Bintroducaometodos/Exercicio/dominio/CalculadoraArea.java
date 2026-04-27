package com.henrique.maratonajava.javacore.Bintroducaometodos.Exercicio.dominio;

public class CalculadoraArea {
    private double area;

    public String calcularArea(double lado){
        this.area = lado * lado;
        return "Área do Quadrado:" + this.area;
    }
    public String calcularArea(double altura, double base){
        this.area = altura * base;
        return "Área do Retangulo:" + this.area;
    }
    public String calcularArea(float raio){
        double pi = 3.14159;
        this.area = pi * (raio * raio);
        return "Área do Circulo: " + this.area;
    }
}
