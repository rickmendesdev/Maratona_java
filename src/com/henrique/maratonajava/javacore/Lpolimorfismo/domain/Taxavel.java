package com.henrique.maratonajava.javacore.Lpolimorfismo.domain;

public interface Taxavel {
   void calcularImposto();
   // O método calcularImposto é um método abstrato, que deve ser implementado por todas as classes que implementarem a interface Taxavel.
   //  Ele é responsável por calcular o imposto de um produto, e pode ser implementado de diferentes formas dependendo do tipo de produto.
}
