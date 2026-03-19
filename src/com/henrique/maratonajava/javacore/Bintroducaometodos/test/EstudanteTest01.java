package com.henrique.maratonajava.javacore.Bintroducaometodos.test;

import com.henrique.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.henrique.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
    Estudante estudante01 = new Estudante();
    Estudante estudante02 = new Estudante();
    ImpressoraEstudante impressora = new ImpressoraEstudante();

    estudante01.nome = "Henrique";
    estudante01.idade = 19;
    estudante01.sexo = 'M';

    estudante02.nome = "Vitória";
    estudante02.idade = 20;
    estudante02.sexo = 'F';
    
    impressora.imprimir(estudante01);
    impressora.imprimir(estudante02);
    
    }
}