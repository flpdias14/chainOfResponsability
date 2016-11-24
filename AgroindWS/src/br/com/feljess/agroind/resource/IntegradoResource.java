package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.IntegradoController;
import br.com.feljess.agroind.model.Integrado;

/**
 * 
 * Classe IntegradoResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 16:57:49 24 de nov de 2016
 * @version 1.0
 */
@Path("/integrado")
public class IntegradoResource {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 24 de nov de 2016 16:57:53
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Integrado> listarTodos(){
		return IntegradoController.listarTodos();
	}
}
