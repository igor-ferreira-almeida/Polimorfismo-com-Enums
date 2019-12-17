package br.com.imposto.lambda;

public enum ImpostoType {

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

    ImpostoType(double percentual) {
        this.percentual = percentual;
    }

    public abstract double calcula(double valor);

    public double getPercentual() {
        return percentual;
    }
}
