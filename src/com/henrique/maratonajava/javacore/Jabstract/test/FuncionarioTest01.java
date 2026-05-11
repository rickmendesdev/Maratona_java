package com.henrique.maratonajava.javacore.Jabstract.test;
import com.henrique.maratonajava.javacore.Jabstract.domain.Gerente;
import com.henrique.maratonajava.javacore.Jabstract.domain.Desenvolvedor;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // Funcionario funcionario = new Funcionario("Henrique", 5000); // Não é possível instanciar uma classe abstrata, pois ela é incompleta e serve apenas como base para outras classes.
        Gerente gerente = new Gerente("Henrique", 4000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Henrique", 8000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprimir();
        desenvolvedor.imprimir();
    }
    
}
