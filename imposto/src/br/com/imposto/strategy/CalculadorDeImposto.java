package br.com.imposto.strategy;

public class CalculadorDeImposto {
    public double calcula(Orcamento orcamento, ImpostoType impostoType) {
        double preco = orcamento.getPreco();

        return preco + impostoType.calcula(preco);
    }
}
