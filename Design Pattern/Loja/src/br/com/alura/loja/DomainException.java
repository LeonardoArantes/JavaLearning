package br.com.alura.loja;

public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 7514146549044879492L;

	public DomainException(String message) {
		super(message);
	}
	
}
