package com.henrique.maratonajava.javacore.Dblocodeinicializaçaodomain.domain;

public class Anime {
    private String nome = "DBZ";
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12,};
    //Sempre que uma instacia/objeto é criado, o bloco de inicialização e contructor automaticamente ja funcionam
    {

        System.out.println("Dentro do bloco de inicialização...");
    }
    public Anime (){
        for (int episodio : this.episodios) {
            System.out.println("Nome: "+ this.nome + " EP: " + episodio + "");
        }
    }
    
}
