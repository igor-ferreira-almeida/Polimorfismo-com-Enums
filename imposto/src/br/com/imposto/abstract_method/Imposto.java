package br.com.imposto.abstract_method;

public enum Imposto {

    ICMS(0.1) {
        @Override
        public double calcula(double valor) {
            return valor * this.getPercentual();
        }
    }, ISS(0.06) {
        @Override
        public double calcula(double valor) {
            return valor * this.getPercentual();
        }
    };

    private final double percentual;

    Imposto(double percentual) {
        this.percentual = percentual;
    }

    public abstract double calcula(double valor);

    public double getPercentual() {
        return percentual;
    }
}
