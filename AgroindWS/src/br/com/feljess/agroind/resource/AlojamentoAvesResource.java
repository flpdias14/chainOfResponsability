package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.AlojamentoAvesController;
import br.com.feljess.agroind.model.AlojamentoAves;

/**
 * 
 * Classe AlojamentoAvesResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:53:04 21 de nov de 2016
 * @version 1.0
 */
@Path("/alojamentoAves")
public class AlojamentoAvesResource {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 15:52:36
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<AlojamentoAves> listarTodos(){
		return AlojamentoAvesController.listarTodos();
	}

}
