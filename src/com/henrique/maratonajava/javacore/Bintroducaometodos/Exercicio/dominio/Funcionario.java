package com.henrique.maratonajava.javacore.Bintroducaometodos.Exercicio.dominio;

public class Funcionario {
    public String nome;
    public double[] salario = new double[3];
    public int idade;

        public void imprime(){
            System.out.println("-------------------");
            
            System.out.println(this.nome);
            for (double salarios : salario) {
                System.out.println(salarios);
            }
            System.out.println(this.idade);
        }
        public void mediaSalario(){
            double media = 0;
            for (double salarios : salario) {
                media += salarios;
            }
            media /= salario.length;
            System.out.println("Média salarial: " + media);
        }
}
