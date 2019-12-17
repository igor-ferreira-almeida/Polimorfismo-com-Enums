package br.com.imposto.lambda;

import br.com.imposto.Orcamento;

public class CalculadorDeImposto {
    public double calcula(Orcamento orcamento, ImpostoType impostoType) {
        double preco = orcamento.getPreco();

        return preco + impostoType.calcula(preco);
    }
}
