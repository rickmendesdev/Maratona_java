package com.henrique.maratonajava.javacore.Emodificadorestatico.domain;

public class Anime {
    private String nome = "DBZ";
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12,};
    //Sempre que uma instacia/objeto é criado, o bloco de inicialização e contructor automaticamente ja funcionam
   // bloco de inicialização estatico roda so uma vez quando a classe é criada
   // posso utilizar outros blocos de inicialização junto com o bloco estatico
    static {

        System.out.println("Dentro do bloco de inicialização...");
    }
    {
        System.out.println("Dentro do bloco de inicialização...");
    }
    public Anime (){
        for (int episodio : this.episodios) {
            System.out.println("Nome: "+ this.nome + " EP: " + episodio + "");
        }
    }
    
}
