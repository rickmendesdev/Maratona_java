package com.henrique.maratonajava.javacore.Fassociação.test;

import com.henrique.maratonajava.javacore.Fassociação.domain.Jogador;
import com.henrique.maratonajava.javacore.Fassociação.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Santos");

         jogador1.setTime(time);

         jogador1.imprime();
    }
    
}
