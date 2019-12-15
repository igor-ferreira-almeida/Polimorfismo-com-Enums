package br.com.imposto.strategy;

public class ISS implements Imposto {
    @Override
    public double calcula(double valor) {
        return valor * ImpostoType.ISS.getPercentual();
    }
}
