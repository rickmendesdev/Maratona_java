package com.henrique.maratonajava.javacore.Aintroducaoclasses.testes;
import com.henrique.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        Professor professor02 = new Professor();
        professor01.nome = "Lucas";
        professor01.idade = 20;
        professor01.sexo = 'M';
        professor01.materia = "Ingles";
        professor01.nome = "Felipe";
        professor02.idade = 21;
        professor02.sexo = 'M';
        professor02.materia = "Historia";
        System.out.println(professor01.nome);
        System.out.println(professor01.idade);
        System.out.println(professor01.sexo);
        System.out.println(professor01.materia);
        System.out.println(professor02.nome);
        System.out.println(professor02.idade);
        System.out.println(professor02.sexo);
        System.out.println(professor02.materia);

    }
}

