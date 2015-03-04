package br.com.iterative.ticketmobile.model.repositories.request;

public class LoginRequest {

	private String email;
	private String senha;
	private String tokenFB;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTokenFB() {
		return tokenFB;
	}

	public void setTokenFB(String tokenFB) {
		this.tokenFB = tokenFB;
	}

}
