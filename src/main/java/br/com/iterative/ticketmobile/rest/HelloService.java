package br.com.iterative.ticketmobile.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Path("/hello")
@Api(value = "/hello", description = "É o olá ao serviço.")
public class HelloService {

	@GET
	@Produces(MediaType.TEXT_HTML)
	@ApiOperation(value = "hello")
	public String sayHtmlHello() {

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("<!DOCTYPE html>");
		stringBuilder.append("<html>");
		stringBuilder.append("<head>");
		stringBuilder.append("<meta charset=\"utf-8\">");
		stringBuilder
				.append("<meta content=\"width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no,target-densitydpi=160\"name=\"viewport\">");
		stringBuilder.append("<title>" + "Ticket Mobile" + "</title>");
		stringBuilder.append("</head>");
		stringBuilder.append("<body>");
		stringBuilder.append("<h1>" + "Olá, Ticket Mobile!" + "</h1>");
		stringBuilder.append("</body>");
		stringBuilder.append("</html>");

		return stringBuilder.toString();

	}

}
