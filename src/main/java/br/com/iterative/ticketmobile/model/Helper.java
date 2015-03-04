package br.com.iterative.ticketmobile.model;

import java.util.Arrays;
import java.util.List;

public class Helper {

	private Helper() {

	}

	public static boolean verificarCampos(Object... params) {

		List<Object> objects = Arrays.asList(params);

		for (Object obj : objects) {

			if (obj == null)
				return false;

		}

		return true;

	}

}
