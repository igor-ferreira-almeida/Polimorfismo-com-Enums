package br.com.imposto.strategy;

public class ICMS implements Imposto {
    @Override
    public double calcula(double valor) {
        return valor * ImpostoType.ICMS.getPercentual();
    }
}
