package br.com.imposto.lambda;

import java.util.function.BiFunction;

public enum ImpostoType {

    ICMS(0.1, (percentual, valor) -> percentual * valor),
    ISS(0.06, (percentual, valor) -> percentual * valor);

    private final Double percentual;

    private final BiFunction<Double, Double, Double> calc;

    ImpostoType(Double percentual, BiFunction<Double, Double, Double> calc) {
        this.percentual = percentual;
        this.calc = calc;
    }

    public Double calcula(double valor) {
        return calc.apply(this.percentual, valor);
    }

    public Double getPercentual() {
        return percentual;
    }
}
