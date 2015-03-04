package br.com.iterative.ticketmobile.model.repositories.response;

import java.util.List;

import br.com.iterative.ticketmobile.model.Cartao;

public class ListarCartoesResponse extends AbstractResponse {

	private List<Cartao> cartoes;

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

}
