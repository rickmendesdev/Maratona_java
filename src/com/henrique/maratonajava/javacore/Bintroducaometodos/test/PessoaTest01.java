package com.henrique.maratonajava.javacore.Bintroducaometodos.test;
import com.henrique.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(25);
        pessoa2.setNome("Maria");
        pessoa2.setIdade(30);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        pessoa2.imprime();
    }

}
