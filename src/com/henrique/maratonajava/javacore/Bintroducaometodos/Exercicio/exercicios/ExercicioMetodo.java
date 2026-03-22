package com.henrique.maratonajava.javacore.Bintroducaometodos.Exercicio.exercicios;

import com.henrique.maratonajava.javacore.Bintroducaometodos.Exercicio.dominio.Funcionario;

public class ExercicioMetodo {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Henrique";
        funcionario.salario[0] = 2500;
        funcionario.salario[1] = 3000;
        funcionario.salario[2] = 3500;
        funcionario.idade = 30;
        funcionario.imprime();
        funcionario.mediaSalario();
    }
}