package br.com.megabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.megabrew.dao.PedidoDao;
import br.com.megabrew.exception.UsuarioNaoAutorizadoException;
import br.com.megabrew.model.Pedido;
import br.com.megabrew.model.Usuario;

@WebService
public class ListagemPedidos {
	@WebResult(name = "pedido")
	public List<Pedido> listarPedidos() {
		PedidoDao pedidoDao = new PedidoDao();
		return pedidoDao.getPedidos();
	}

	@WebResult(name = "cliente")
	public List<Pedido> listarPedidosPorCliente(@WebParam(name = "login", header = true) String login) {
		PedidoDao pedidoDao = new PedidoDao();
		return pedidoDao.getPedidosByClienteLogin(login);
	}

	public void criarPedido(@WebParam(name = "pedido", header = true) Pedido pedido,
			@WebParam(name = "usuario", header = true) Usuario usuario) {

		if (usuario.getLogin().equals(pedido.getCliente().getUsuario().getLogin())
				&& usuario.getSenha().equals(pedido.getCliente().getUsuario().getSenha())) {
			PedidoDao pedidoDao = new PedidoDao();
			pedidoDao.adiciona(pedido);
		} else {
			throw new UsuarioNaoAutorizadoException("Usuario não autorizado!");
		}

	}
}
