package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.TecnicoController;
import br.com.feljess.agroind.model.Tecnico;

/**
 * 
 * Classe TecnicoResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:52:23 15 de nov de 2016
 * @version 1.0
 */
@Path("/tecnico")
public class TecnicoResource {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:52:30
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Tecnico> listarTodos(){
		return TecnicoController.listarTodos();
	}

}
