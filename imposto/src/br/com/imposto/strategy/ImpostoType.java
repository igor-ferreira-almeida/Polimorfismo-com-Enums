package br.com.imposto.strategy;

import javax.swing.*;

public enum ImpostoType {

    ICMS(0.1, new ICMS()),
    ISS(0.06, new ISS());

    private final double percentual;
    private final Imposto imposto;

    ImpostoType(double percentual, Imposto imposto) {
        this.percentual = percentual;
        this.imposto = imposto;
    }

    public double getPercentual() {
        return percentual;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public double calcula(double valor) {
        return this.imposto.calcula(valor);
    }
}
