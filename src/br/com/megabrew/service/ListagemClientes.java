package br.com.megabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.megabrew.dao.ClienteDao;
import br.com.megabrew.model.Cliente;

@WebService
public class ListagemClientes {
	@WebResult(name="cliente")
	public List<Cliente> listarClientes(){
		ClienteDao clienteDao = new ClienteDao();
		return clienteDao.getClientes();
	}
	
	public void criaCliente(
			@WebParam(name="cliente", header= true) Cliente cliente){
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.adiciona(cliente);
	}
}



