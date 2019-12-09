package br.com.documento;

public enum TipoDocumento {
	
	RG("RG - Registro Geral", new FormatadorRG()),
    CPF("CPF - Cadastro de Pessoas Físicas", new FormatadorCPF()),
    CNPJ("CNPJ - Cadastro Nacional da Pessoa Jurídica", new FormatadorCNPJ());
	
	private String descricao;
	private Formatador formatador;

    /**
     * Construtor privado para montar a enum
     */
    private TipoDocumento(String descricao, Formatador formatador) {
        this.descricao = descricao;
        this.formatador = formatador;
    }

    public String getDescricao() {
        return descricao;
    }
    
    /**
     * Formata número do documento
     */
    public String formata(String numero) {
        if (this.formatador == null) {
            return numero;
        }
        return this.formatador.formata(numero);
    }
}
