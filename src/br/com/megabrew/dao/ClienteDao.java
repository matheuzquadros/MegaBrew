package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.Cliente;
import br.com.megabrew.model.Usuario;

public class ClienteDao {
	private static List<Cliente> clientes = new ArrayList<Cliente>();
	
	static{
		Cliente c1 = new Cliente();
		c1.setId("1");
		c1.setNome("Matheus");
		Usuario u1 = new Usuario();
		u1.setLogin("matheus");
		u1.setSenha("matheus");
		c1.setTelefone("11111");
		c1.setUsuario(u1);
		clientes.add(c1);
		
		Cliente c2 = new Cliente();
		c1.setId("2");
		c1.setNome("Arthur");
		c2.setTelefone("2222");
		Usuario u2 = new Usuario();
		u2.setLogin("arthur");
		u2.setSenha("arthur");
		c1.setUsuario(u2);
		clientes.add(c2);
	}
	
	public List<Cliente> getClientes(){
		return clientes;
	}
	
	public void adiciona(Cliente cliente){
		clientes.add(cliente);
	}
}
