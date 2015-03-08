package br.com.iterative.ticketmobile.model.repositories.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListarCartoesRequest {

	private long idUsuario;

	public ListarCartoesRequest() {

	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

}
