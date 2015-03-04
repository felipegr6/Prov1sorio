package br.com.iterative.ticketmobile.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.iterative.ticketmobile.model.Helper;
import br.com.iterative.ticketmobile.model.repositories.request.EnviarTokenRequest;
import br.com.iterative.ticketmobile.model.repositories.request.LoginRequest;
import br.com.iterative.ticketmobile.model.repositories.response.EnviarTokenResponse;
import br.com.iterative.ticketmobile.model.repositories.response.LoginResponse;

import com.google.gson.Gson;

@Path("/login")
public class LoginService {

	@POST
	@Path("/autenticar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String login(String content) {

		LoginResponse loginResponse;
		LoginRequest loginRequest;
		Gson gson = new Gson();

		loginRequest = gson.fromJson(content, LoginRequest.class);

		if (Helper.verificarCampos(loginRequest.getEmail(),
				loginRequest.getSenha()))
			loginResponse = new LoginResponse(200, "OK", 123456L);
		else
			loginResponse = new LoginResponse(500, "NOK", 0L);

		return gson.toJson(loginResponse);

	}

	@POST
	@Path("/enviarToken")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String enviarToken(String content) {

		Gson gson = new Gson();
		EnviarTokenRequest tokenRequest;
		EnviarTokenResponse tokenResponse;

		tokenRequest = gson.fromJson(content, EnviarTokenRequest.class);

		if (Helper.verificarCampos(tokenRequest.getIdUsuario(),
				tokenRequest.getDeviceToken(), tokenRequest.getPlataforma()))
			tokenResponse = new EnviarTokenResponse(200, "OK");
		else
			tokenResponse = new EnviarTokenResponse(500, "NOK");

		return gson.toJson(tokenResponse);

	}
	
	@POST
	public String recuperarSenha(String content) {
		throw new UnsupportedOperationException();
	}

}