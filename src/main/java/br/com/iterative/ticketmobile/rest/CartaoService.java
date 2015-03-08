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
import br.com.iterative.ticketmobile.model.repositories.response.ListarCartoesResponse;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Path("/cartao")
@Api(value = "/cartao", description = "Serviços de Cartão", produces = "JSON", consumes = "JSON")
public class CartaoService {

	@GET
	@Path("/consultarSaldo")
	@ApiOperation(value = "ConsultarSaldo")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarSaldo(String content) {
		throw new UnsupportedOperationException();
	}

	@GET
	@Path("/consultarExtrato")
	@ApiOperation(value = "ConsultarExtrato")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarExtrato(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/alterarApelido")
	@ApiOperation(value = "AlterarApelido")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String alterarApelido(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/removerCartao")
	@ApiOperation(value = "RemoverCartao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String removerCartao(String content) {
		throw new UnsupportedOperationException();
	}

	@GET
	@Path("/listarCartao")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "ListarCartao")
	public String listarCartao(String cartoesRequest) {

		ListarCartoesResponse cartoesResponse;

		List<Cartao> cartoes = new ArrayList<>();

		cartoesResponse = new ListarCartoesResponse(0, "", cartoes);

		return cartoesResponse.toString();

	}

	@POST
	@Path("/existeCartao")
	@ApiOperation(value = "ExisteCartao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String existeCartao(String content) {
		throw new UnsupportedOperationException();
	}

	@POST
	@Path("/cadastrarCartao")
	@ApiOperation(value = "CadastrarCartao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String cadastrarCartao(String content) {

		throw new UnsupportedOperationException();

	}

}