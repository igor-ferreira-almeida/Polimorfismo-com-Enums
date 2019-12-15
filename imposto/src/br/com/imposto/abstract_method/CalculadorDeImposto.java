package br.com.imposto.abstract_method;

public class CalculadorDeImposto {
    public double calcula(Orcamento orcamento, Imposto imposto) {
        double preco = orcamento.getPreco();

        return preco + imposto.calcula(preco);
    }
}
