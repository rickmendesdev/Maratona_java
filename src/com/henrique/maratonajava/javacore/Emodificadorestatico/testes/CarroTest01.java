package com.henrique.maratonajava.javacore.Emodificadorestatico.testes;

import com.henrique.maratonajava.javacore.Emodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Bmw", 300 );
        Carro carro2 = new Carro("Hilux", 150 );
        Carro carro3 = new Carro("BYD", 200);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
    
}
