package br.com.iterative.ticketmobile.model.repositories.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnviarTokenResponse extends AbstractResponse {

	public EnviarTokenResponse() {
		super();
	}

	public EnviarTokenResponse(int status, String mensagem) {
		super(status, mensagem);
	}

}
