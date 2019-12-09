package br.com.documento;

public class DocumentoTest {

	public static void main(String[] args) {
		Documento cpf = new Documento("63703867582", TipoDocumento.CPF);
		String formatado = cpf.formata(); // 637.038.675-82
		
		System.out.println(formatado);
	}

}
