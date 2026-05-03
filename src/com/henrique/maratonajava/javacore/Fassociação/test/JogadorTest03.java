package com.henrique.maratonajava.javacore.Fassociação.test;

import com.henrique.maratonajava.javacore.Fassociação.domain.Jogador;
import com.henrique.maratonajava.javacore.Fassociação.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Mbappe");
        Jogador jogador2 = new Jogador("Olise");
        Jogador jogador3 = new Jogador("Dembele");
        Time time = new Time("França");
        Jogador [] jogadores = {jogador1, jogador2, jogador3};
        time.setJogadores(jogadores);
        jogador1.setTime(time);
            jogador2.setTime(time);
            jogador3.setTime(time);
        System.out.println("----Time----");
        time.imprime();
        System.out.println("----Jogadores----");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();

    }
    
}
