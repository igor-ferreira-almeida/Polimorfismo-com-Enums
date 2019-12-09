package br.com.documento;

public class FormatadorCNPJ implements Formatador {

	@Override
	public String formata(String numero) {
		return "99.999.999/9999-99";
	}

}
