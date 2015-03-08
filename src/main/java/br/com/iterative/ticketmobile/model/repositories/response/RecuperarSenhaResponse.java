package br.com.iterative.ticketmobile.model.repositories.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RecuperarSenhaResponse extends AbstractResponse {

	public RecuperarSenhaResponse() {
		super();
	}

	public RecuperarSenhaResponse(int status, String message) {
		super(status, message);
	}

}
