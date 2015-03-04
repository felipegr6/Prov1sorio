package br.com.iterative.ticketmobile.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/cadastro")
public class UsuarioService {

	@POST
	public String cadastrarUsuario(String content) {
		throw new UnsupportedOperationException();
	}

	@GET
	public String recuperarDadosUsuario(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	public String alterarSenha(String content) {
		throw new UnsupportedOperationException();
	}

}