package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.VacinasController;
import br.com.feljess.agroind.model.Vacinas;
/**
 * 
 * Classe VacinasResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:57:37 21 de nov de 2016
 * @version 1.0
 */
@Path("/vacinas")
public class VacinasResource {
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 14:57:41
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Vacinas> listarTodos(){
		return VacinasController.listarTodos();
	}

}
