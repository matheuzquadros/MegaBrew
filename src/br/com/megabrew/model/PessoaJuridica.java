package br.com.megabrew.model;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	private ClienteJuridico tipoNegocio;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String cnpj, ClienteJuridico tipoNegocio) {
		super();
		this.cnpj = cnpj;
		this.tipoNegocio = tipoNegocio;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ClienteJuridico getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(ClienteJuridico tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}
		
	
}
