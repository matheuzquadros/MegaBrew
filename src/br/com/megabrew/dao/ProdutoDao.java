package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.Produto;

public class ProdutoDao {
	private static List<Produto> produtos = new ArrayList<Produto>();
	
	static{
		Produto p1 = new Produto();
		p1.setNome("DvD Senhor dos aneis");
		p1.setValor(20);
		p1.setQuantidadeEstoque(10);
		produtos.add(p1);
		
		Produto p2 = new Produto();
		p2.setNome("Box Game of Thrones");
		p2.setQuantidadeEstoque(20);
		p2.setValor(50);
		produtos.add(p2);
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	public void adiciona(Produto produto){
		produtos.add(produto);
	}
}
