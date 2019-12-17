package br.com.imposto.lambda;

public class ImpostoTest {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.setPreco(500);

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        System.out.println(calculadorDeImposto.calcula(orcamento, Imposto.ICMS));
        System.out.println(calculadorDeImposto.calcula(orcamento, Imposto.ISS));
    }
}
