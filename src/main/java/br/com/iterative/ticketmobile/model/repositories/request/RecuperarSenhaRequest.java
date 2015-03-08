package br.com.iterative.ticketmobile.model.repositories.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RecuperarSenhaRequest {

	private String senha;
	private String cpf;

	public RecuperarSenhaRequest() {

	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}