package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.UsuariosController;
import br.com.feljess.agroind.model.Usuarios;

/**
 * 
 * Classe UsuariosResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 12:28:02 15 de nov de 2016
 * @version 1.0
 */
@Path("/usuarios")
public class UsuariosResource {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 12:27:58
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Usuarios> listarTodos(){
		return UsuariosController.listarTodos();
	}
}
