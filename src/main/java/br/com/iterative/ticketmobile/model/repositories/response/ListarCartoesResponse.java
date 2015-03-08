package br.com.iterative.ticketmobile.model.repositories.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.iterative.ticketmobile.model.Cartao;

import com.google.gson.Gson;

@XmlRootElement
public class ListarCartoesResponse extends AbstractResponse {

	private List<Cartao> cartoes;

	public ListarCartoesResponse() {

		this.cartoes = new ArrayList<Cartao>();

	}

	public ListarCartoesResponse(int status, String mensagem,
			List<Cartao> cartoes) {

		super(status, mensagem);

		this.cartoes = cartoes;

	}

	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	@Override
	public String toString() {
		return new Gson().toJson(new ListarCartoesResponse(this.getStatus(),
				this.getMensagem(), this.cartoes));
	}
}