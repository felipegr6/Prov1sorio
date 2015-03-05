package br.com.iterative.ticketmobile.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cadastro")
public class UsuarioService {

	@POST
	@Path("/cadastrarUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String cadastrarUsuario(String content) {
		throw new UnsupportedOperationException();
	}

	@GET
	@Path("/recuperarDados")
	@Produces(MediaType.APPLICATION_JSON)
	public String recuperarDadosUsuario(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/alterarSenha")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String alterarSenha(String content) {
		throw new UnsupportedOperationException();
	}

}