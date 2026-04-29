package com.henrique.maratonajava.javacore.Fassociação.test;

import com.henrique.maratonajava.javacore.Fassociação.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Messi");
        Jogador[] jogadores = {jogador1 , jogador2, jogador3};
        
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
