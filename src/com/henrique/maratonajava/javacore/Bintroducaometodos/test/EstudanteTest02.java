package com.henrique.maratonajava.javacore.Bintroducaometodos.test;

import com.henrique.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
    Estudante estudante02 = new Estudante();
    

    estudante01.nome = "Henrique";
    estudante01.idade = 19;
    estudante01.sexo = 'M';

    estudante02.nome = "Vitória";
    estudante02.idade = 20;
    estudante02.sexo = 'F';
    
    estudante01.imprime();
    estudante02.imprime();
    }
}
