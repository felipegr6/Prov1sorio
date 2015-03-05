package br.com.iterative.ticketmobile.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/estabelecimento")
public class EstabelecimentoService {

	@GET
	@Path("/detalhar")
	@Produces(MediaType.APPLICATION_JSON)
	public String detalharEstabelecimento(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/favoritar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String favoritarEstabelecimento(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/avaliar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String avaliarEstabelecimento(String content) {
		throw new UnsupportedOperationException();
	}

	@GET
	@Path("/listarTipos")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarTiposEstabelecimento(String content) {
		throw new UnsupportedOperationException();
	}

}
