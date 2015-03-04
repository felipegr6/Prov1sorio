package br.com.iterative.ticketmobile.model.repositories.response;

public abstract class AbstractResponse {

	private int status;
	private String mensagem;

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
