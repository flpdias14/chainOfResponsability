package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.UnidadesController;
import br.com.feljess.agroind.model.Unidades;


/**
 * 
 * Classe UnidadesResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:52:00 15 de nov de 2016
 * @version 1.0
 */
@Path("/unidade")
public class UnidadesResource {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:52:06
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Unidades> listarTodos(){
		return UnidadesController.listarTodos();
	}
}
