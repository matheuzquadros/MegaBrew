package br.com.megabrew.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)
public class ItemPedido {
	@XmlID
	@XmlElement(required = true)
	private String id;
	
	private Produto produto;
	private int quantidade;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@XmlElement(name = "subTotal")
	public double getSubTotal() {
		return getProduto().getValor() * getQuantidade();
	}

}
