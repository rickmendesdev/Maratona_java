package com.henrique.maratonajava.javacore.Heranca.teste;
import com.henrique.maratonajava.javacore.Heranca.domain.Endereço;
import com.henrique.maratonajava.javacore.Heranca.domain.Pessoa;
import com.henrique.maratonajava.javacore.Heranca.domain.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args) {
     Endereço endereço = new Endereço();
     endereço.setRua("Rua 1");
     endereço.setCep("12345-678"); 
     Pessoa pessoa = new Pessoa("Henrique");
    
     pessoa.setCpf("123.456.789-00");
     pessoa.setIdade(20);
     pessoa.setEndereço(endereço);
     System.out.println("----------");
        pessoa.imprime();
     Funcionario funcionario = new Funcionario("Maria");
        funcionario.setCpf("987.654.321-00");
        funcionario.setIdade(25);
        funcionario.setEndereço(endereço);
        funcionario.setSalario(5000.0);
     System.out.println("----------");
        funcionario.imprime();

    }
}
