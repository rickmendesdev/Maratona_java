package com.henrique.maratonajava.javacore.Emodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double  velocidadeLimite = 250;

    

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Nome " + this.nome);
        System.out.println("velocidade maxima " + this.velocidadeMaxima);
        System.out.println("velocidade limite " + this.velocidadeLimite);
        // O this pode ser utilizado com o atributo static dentro do void pq tem certeza que a instancia vai existir
    }
    // ==========================================
    // MÉTODOS ESTÁTICOS (NÃO têm acesso ao 'this')
    // ==========================================
    public static double getVelocidadeLimite(){
    // Retorna a variável estática. Repare que NÃO usamos 'this.velocidadeLimite'
        return velocidadeLimite;
    }

    // Setter estático
    public static void setVelocidadeLimite(double velocidadeLimite) {
        // Altera a variável estática para todos os carros de uma vez só
        Carro.velocidadeLimite = velocidadeLimite;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    

    
}
