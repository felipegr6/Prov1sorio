package br.com.iterative.ticketmobile.model.repositories.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginResponse extends AbstractResponse {

	private long idUsuario;

	public LoginResponse() {
		super();
	}

	public LoginResponse(int status, String mensagem, long idUsuario) {

		super(status, mensagem);

		this.idUsuario = idUsuario;

	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

}
