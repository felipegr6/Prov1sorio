package br.com.iterative.ticketmobile.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.iterative.ticketmobile.model.Cartao;
import br.com.iterative.ticketmobile.model.repositories.request.ListarCartoesRequest;
import br.com.iterative.ticketmobile.model.repositories.response.ListarCartoesResponse;

import com.google.gson.Gson;

@Path("/cartao")
public class CartaoService {

	@GET
	@Path("/consultarSaldo")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarSaldo(String content) {
		throw new UnsupportedOperationException();
	}

	@GET
	@Path("/consultarExtrato")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarExtrato(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/alterarApelido")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String alterarApelido(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/removerCartao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String removerCartao(String content) {
		throw new UnsupportedOperationException();
	}

	@GET
	@Path("/listarCartao")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarCartao(String content) {

		ListarCartoesRequest cartoesRequest;
		ListarCartoesResponse cartoesResponse;
		Gson gson = new Gson();

		List<Cartao> cartoes = new ArrayList<>();

		cartoesRequest = gson.fromJson(content, ListarCartoesRequest.class);
		cartoesResponse = new ListarCartoesResponse(0, "", cartoes);

		return gson.toJson(cartoesResponse);

	}

	@POST
	@Path("/existeCartao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String existeCartao(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/cadastrarCartao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String cadastrarCartao(String content) {

		throw new UnsupportedOperationException();

	}

}