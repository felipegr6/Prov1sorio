package br.com.iterative.ticketmobile.model.repositories.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement
public class EnviarTokenRequest {

	@ApiModelProperty(required = true)
	private long idUsuario;
	@ApiModelProperty(required = true, value = "0, 1 ou 2")
	private int plataforma;
	@ApiModelProperty(required = true)
	private String deviceToken;

	public EnviarTokenRequest() {

	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

}
