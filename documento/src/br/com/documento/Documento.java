package br.com.documento;

public class Documento {

    private String numero;
    private TipoDocumento tipo;
    
    public Documento(String numero, TipoDocumento tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	public String formata() {
        return this.tipo.formata(this.numero);
    }
}
