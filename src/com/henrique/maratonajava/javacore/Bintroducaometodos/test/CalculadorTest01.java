package com.henrique.maratonajava.javacore.Bintroducaometodos.test;
import java.util.Scanner;
import com.henrique.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadorTest01 {
    public static void main(String[] args) {
    
    Calculadora calculadora = new Calculadora();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero: ");
        int a = scanner.nextInt();
    System.out.println("Digite outro numero: ");
        int b = scanner.nextInt();
    int result = calculadora.somar(a, b);
    System.out.println("A soma é: " + result);
    
    System.out.println("Digite um numero: ");
        int n3 = scanner.nextInt();
    System.out.println("Digite outro numero: ");
        int n4 = scanner.nextInt();
        System.out.println("A subtração é: ");
        calculadora.subtrair(n3, n4);
        
         scanner.close();
    }
}
