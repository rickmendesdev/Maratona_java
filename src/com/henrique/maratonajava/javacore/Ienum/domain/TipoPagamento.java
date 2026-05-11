package com.henrique.maratonajava.javacore.Ienum.domain;

public enum TipoPagamento {
    
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;            
        }
    }, 
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };


    public abstract double calcularDesconto(double valor);
      // O método calcularDesconto é declarado como abstrato na enumeração, e cada constante (DEBITO e CREDITO) fornece sua própria implementação do método, calculando o desconto de acordo com a lógica específica para cada tipo de pagamento.
}
