package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.ItemPedido;
import br.com.megabrew.model.Produto;

public class ItemPedidoDao {
	private static List<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	static{
		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> produtos = produtoDao.getProdutos();
		
		int count = 0;
		for(Produto p : produtos){
			ItemPedido i1 = new ItemPedido();
			i1.setId(String.valueOf(count));
			i1.setProduto(p);
			itens.add(i1);
			count++;
		}
	}
	
	public List<ItemPedido> getItens(){
		return itens;
	}
	
	public void adiciona(ItemPedido item){
		itens.add(item);
	}
}
