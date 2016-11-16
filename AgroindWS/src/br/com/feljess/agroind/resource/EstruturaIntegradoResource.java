package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.EstruturaIntegradoController;
import br.com.feljess.agroind.model.EstruturaIntegrado;

/**
 * 
 * Classe EstruturaIntegradoResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 13:09:11 15 de nov de 2016
 * @version 1.0
 */
@Path("estruturaIntegrado")
public class EstruturaIntegradoResource {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 13:09:15
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<EstruturaIntegrado> listarTodos(){
		return EstruturaIntegradoController.listarTodos();
	}

}
