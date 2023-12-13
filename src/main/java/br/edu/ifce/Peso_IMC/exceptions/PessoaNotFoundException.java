package br.edu.ifce.Peso_IMC.exceptions;

public class PessoaNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public PessoaNotFoundException (Long id) {
		super("Não foi possível encontrar o cliente de id: " + id);
	}

}
