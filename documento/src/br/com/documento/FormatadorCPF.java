package br.com.documento;

public class FormatadorCPF implements Formatador {

	@Override
	public String formata(String numero) {
		return "999.999.999-99";
	}

}
