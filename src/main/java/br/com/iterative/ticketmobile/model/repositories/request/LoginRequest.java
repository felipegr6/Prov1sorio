package br.com.iterative.ticketmobile.model.repositories.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement
public class LoginRequest {

	@ApiModelProperty(value = "E-mail", required = true, allowableValues = "name@at.com")
	private String email;
	@ApiModelProperty(value = "Senha", required = true, allowableValues = "Xyz123*")
	private String senha;
	@ApiModelProperty(value = "Token Facebook", required = false, allowableValues = "anflheafga")
	private String tokenFB;

	public LoginRequest() {

	}

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
