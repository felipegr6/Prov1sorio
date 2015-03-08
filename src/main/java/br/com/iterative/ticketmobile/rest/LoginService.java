package br.com.iterative.ticketmobile.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.iterative.ticketmobile.model.Helper;
import br.com.iterative.ticketmobile.model.repositories.request.EnviarTokenRequest;
import br.com.iterative.ticketmobile.model.repositories.request.LoginRequest;
import br.com.iterative.ticketmobile.model.repositories.request.RecuperarSenhaRequest;
import br.com.iterative.ticketmobile.model.repositories.response.EnviarTokenResponse;
import br.com.iterative.ticketmobile.model.repositories.response.LoginResponse;
import br.com.iterative.ticketmobile.model.repositories.response.RecuperarSenhaResponse;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Path("/login")
@Api(value = "/login", description = "Operações de Login")
public class LoginService {

	@POST
	@Path("/Autenticar")
	@ApiOperation(value = "Autenticar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public LoginResponse login(LoginRequest loginRequest) {

		LoginResponse loginResponse;

		if (Helper.verificarCampos(loginRequest.getEmail(),
				loginRequest.getSenha()))
			loginResponse = new LoginResponse(200, "OK", 123456L);
		else
			loginResponse = new LoginResponse(500, "NOK", 0L);

		return loginResponse;

	}

	@POST
	@Path("/EnviarToken")
	@ApiOperation(value = "EnviarToken")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EnviarTokenResponse enviarToken(EnviarTokenRequest tokenRequest) {

		EnviarTokenResponse tokenResponse;

		if (Helper.verificarCampos(tokenRequest.getIdUsuario(),
				tokenRequest.getDeviceToken(), tokenRequest.getPlataforma()))
			tokenResponse = new EnviarTokenResponse(200, "OK");
		else
			tokenResponse = new EnviarTokenResponse(500, "NOK");

		return tokenResponse;

	}

	@POST
	@Path("/RecuperarSenha")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "RecuperarSenha")
	public RecuperarSenhaResponse recuperarSenha(RecuperarSenhaRequest request) {
		throw new UnsupportedOperationException();
	}

}