package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.ContatoController;
import br.com.feljess.agroind.model.Contato;


/**
 * 
 * Classe ContatoResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:54:07 15 de nov de 2016
 * @version 1.0
 */
@Path("/contato")
public class ContatoResource {
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:54:12
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Contato> listarTodos(){
		return ContatoController.listarTodos();
	}

}
