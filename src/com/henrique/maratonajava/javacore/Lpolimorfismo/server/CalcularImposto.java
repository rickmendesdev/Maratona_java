package com.henrique.maratonajava.javacore.Lpolimorfismo.server;
import com.henrique.maratonajava.javacore.Lpolimorfismo.domain.Camisa;
import com.henrique.maratonajava.javacore.Lpolimorfismo.domain.Computador;

public class CalcularImposto {
    public static void calcularImpostocomputador(Computador computador) {
        System.out.println("------------------------------");
        System.out.println("| Calculando imposto do computador Relatório: |");
        System.out.println("Nome: " + computador.getNome() );
        System.out.println("Preço antes do imposto: " + computador.getPreco());
        computador.calcularImposto();
        System.out.println("Preço depois do imposto: " + computador.getPreco());

    }
    public static void calcularImpostocamisa(Camisa camisa) {
        System.out.println("------------------------------");
        System.out.println("| Calculando imposto da camisa Relatório: |");
        System.out.println("Nome: " + camisa.getNome() );
        System.out.println("Preço antes do imposto: " + camisa.getPreco());
        camisa.calcularImposto();
        System.out.println("Preço depois do imposto: " + camisa.getPreco());

    }
    
}
