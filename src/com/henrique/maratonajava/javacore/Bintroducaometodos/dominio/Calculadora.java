package com.henrique.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public int somar(int a, int b){
    return a + b;
    } 
    public void multiplicar(int a, int b){
        System.out.println(a * b);
    }
    public void subtrair(double a, double b){
    System.out.println(a - b);
    }
    public double dividir(double a , double b){
      if (a == 0) { 
        return 0;
      }
      return a/b;
    }
}
