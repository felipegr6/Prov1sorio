package br.com.iterative.ticketmobile.model.repositories.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement
public abstract class AbstractResponse {

	@ApiModelProperty(required = true)
	private int status;
	@ApiModelProperty(required = true)
	private String mensagem;

	public AbstractResponse() {

	}

	public AbstractResponse(int status, String mensagem) {
		this.mensagem = mensagem;
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMessagem(String messagem) {
		this.mensagem = messagem;
	}

}
