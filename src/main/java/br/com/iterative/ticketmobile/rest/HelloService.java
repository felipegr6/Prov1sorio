package br.com.iterative.ticketmobile.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("<html>");
		stringBuilder.append("<head>");
		stringBuilder.append("<title>" + "Ticket Mobile" + "</title>");
		stringBuilder.append("</head>");
		stringBuilder.append("<body>");
		stringBuilder.append("<h1>" + "Olá, Ticket Mobile!" + "</h1>");
		stringBuilder.append("</body>");
		stringBuilder.append("</html>");

		return stringBuilder.toString();

	}

}
