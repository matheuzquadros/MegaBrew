package br.com.megabrew.model;

public class PessoaFisica extends Cliente{
	
	private String cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
