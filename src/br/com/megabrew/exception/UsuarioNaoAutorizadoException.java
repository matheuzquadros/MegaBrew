package br.com.megabrew.exception;


import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.ws.WebFault;

import br.com.megabrew.util.AdaptadorDate;

@SuppressWarnings("serial")
@WebFault(targetNamespace="http://service.megabrew.catolicasc.org.br/excecoes", name="UsuarioNaoAutorizadoException")
public class UsuarioNaoAutorizadoException extends RuntimeException{
	@XmlJavaTypeAdapter(AdaptadorDate.class)
	private static Date horaExcecao = new Date();
	public UsuarioNaoAutorizadoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public UsuarioNaoAutorizadoException(String message) {
		
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	@XmlAccessorType(XmlAccessType.FIELD)
	public class UsuarioFaultInfo{
		
		public String message;
		public UsuarioFaultInfo(){}
		public UsuarioFaultInfo(String message){
			this.message = message;
		}
		
	}


}
