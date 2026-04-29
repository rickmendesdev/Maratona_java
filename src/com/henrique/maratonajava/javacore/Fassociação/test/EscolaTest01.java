package com.henrique.maratonajava.javacore.Fassociação.test;

import com.henrique.maratonajava.javacore.Fassociação.domain.Escola;
import com.henrique.maratonajava.javacore.Fassociação.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Paulo");
         Professor professor2= new Professor("Jorge");
        
        Professor [] professores = {professor1, professor2 };

        Escola escola = new Escola("Uninassau", professores);

        escola.imprime();

    }
    
}
