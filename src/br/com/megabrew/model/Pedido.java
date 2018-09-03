package br.com.megabrew.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
@XmlAccessorType(XmlAccessType.FIELD)
public class Pedido {
	
	@XmlID
	@XmlElement(required = true)
	private String id;
	
	
	@XmlElement(name = "cliente")
	private Cliente cliente;
	
	@XmlElementWrapper(name = "itens")
	@XmlElement(name = "item")
	private List<ItemPedido> itensPedido;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itens) {
		this.itensPedido = itens;
	}

	@XmlElement(name = "valorTotal")
	public double getValorTotal() {
		double valorTotal = 0;
		for (ItemPedido p : this.itensPedido) {
			valorTotal += p.getProduto().getValor() * p.getQuantidade();
		}
		return valorTotal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
