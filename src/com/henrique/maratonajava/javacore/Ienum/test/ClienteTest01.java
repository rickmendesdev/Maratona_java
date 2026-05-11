package com.henrique.maratonajava.javacore.Ienum.test;
import com.henrique.maratonajava.javacore.Ienum.domain.Cliente;
import com.henrique.maratonajava.javacore.Ienum.domain.TipoCliente;
import com.henrique.maratonajava.javacore.Ienum.domain.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Henrique", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        System.out.println(cliente);
    }
    
}
