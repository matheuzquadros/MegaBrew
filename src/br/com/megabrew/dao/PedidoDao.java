package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.megabrew.model.Cliente;
import br.com.megabrew.model.ItemPedido;
import br.com.megabrew.model.Pedido;
import br.com.megabrew.model.Produto;
import br.com.megabrew.model.Usuario;

public class PedidoDao {
	private static List<Pedido> pedidos = new ArrayList<Pedido>();
	
	static{
		 Pedido p1 = new Pedido();
		 p1.setId("1");
		 
		 Cliente c1 = new Cliente();
		 c1.setId("1");
		 c1.setNome("Matheus");
		 c1.setTelefone("999");
		 Usuario u1 = new Usuario();
		 u1.setLogin("matheusq");
		 u1.setSenha("matheus");
		 c1.setUsuario(u1);
		 
		 ItemPedido i1 = new ItemPedido();
		 i1.setId("1");
		 i1.setQuantidade(2);
		 Produto prod1 = new Produto();
		 prod1.setId("1");
		 prod1.setNome("Breja 1");
		 prod1.setQuantidadeEstoque(10);
		 prod1.setValor(50);
		 i1.setProduto(prod1);
		 List<ItemPedido> itens = new ArrayList<ItemPedido>();
		 itens.add(i1);
		 p1.setItensPedido(itens);
		 p1.setCliente(c1);
		 
		 pedidos.add(p1);
	}
	
	public List<Pedido> getPedidos(){
		return pedidos;
	}
	
	public List<Pedido> getPedidosByClienteLogin(String login){
		return pedidos.stream()
				.filter(p-> p.getCliente().getUsuario().getLogin().equals(login))
				.collect(Collectors.toList());
	}
	
	public void adiciona(Pedido pedido){
		pedidos.add(pedido);
	}
}
