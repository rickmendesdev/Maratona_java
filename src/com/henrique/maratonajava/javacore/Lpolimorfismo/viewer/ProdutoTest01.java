package com.henrique.maratonajava.javacore.Lpolimorfismo.viewer;
import com.henrique.maratonajava.javacore.Lpolimorfismo.domain.Camisa;
import com.henrique.maratonajava.javacore.Lpolimorfismo.domain.Computador;
import com.henrique.maratonajava.javacore.Lpolimorfismo.server.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        //Produto produto = new Produto("Notebook", 3000); // Não é possível instanciar uma classe abstrata
        Computador computador = new Computador("Notebook", 3000);
        CalcularImposto.calcularImpostocomputador(computador);
        Camisa camisa = new Camisa("Camisa Polo", 150);
        CalcularImposto.calcularImpostocamisa(camisa);
    }
    
}
