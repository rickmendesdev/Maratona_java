package com.henrique.maratonajava.javacore.Cintroduçãoconstrutores.teste;

import com.henrique.maratonajava.javacore.Cintroduçãoconstrutores.domain.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto("Teclado Mecânico", 250.50);
        Produto p3 = new Produto("Monitor 24 pol",12 ,899.9);

        p1.imprime();
        p2.imprime();
        p3.imprime();

    }
    
}
