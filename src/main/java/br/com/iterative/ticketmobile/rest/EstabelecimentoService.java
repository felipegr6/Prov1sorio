package br.com.iterative.ticketmobile.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/estabelecimento")
public class EstabelecimentoService {

	@GET
	public String detalharEstabelecimento(String content) {
		return null;
	}

	@POST
	public String favoritarEstabelecimento(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	public String avaliarEstabelecimento(String content) {
		throw new UnsupportedOperationException();
	}
	
	@GET
	public String listarTiposEstabelecimento(String content) {
		throw new UnsupportedOperationException();	
	}

}
