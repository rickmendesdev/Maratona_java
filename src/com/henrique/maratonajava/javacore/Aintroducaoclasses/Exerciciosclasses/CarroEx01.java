package com.henrique.maratonajava.javacore.Aintroducaoclasses.Exerciciosclasses;
import com.henrique.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroEx01 {
    public static void main(String[] args) {
        
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        carro01.ano = 2016;
        carro01.modelo = "Renegade";
        carro01.marca = "Jeep";
        carro02.ano = 2018;
        carro02.modelo = "Corolla";
        carro02.marca = "Toyota";
        System.out.println("Carro 1 marca: " + carro01.marca + "\n" +
                           "Carro 1 modelo: " + carro01.modelo + "\n" +
                           "Carro 1 ano: " + carro01.ano + "\n");
        System.out.println("Carro 2 marca: " + carro02.marca + "\n" +
                           "Carro 2 modelo: " + carro02.modelo + "\n" +
                            "Carro 2 ano: " + carro02.ano);

        
    }
    
}
