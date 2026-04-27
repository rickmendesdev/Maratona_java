package com.henrique.maratonajava.javacore.Cintroduçãoconstrutores.teste;

import com.henrique.maratonajava.javacore.Cintroduçãoconstrutores.domain.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("DBZ", 255, "Shounen");
        anime.imprime();
    }
    
}
