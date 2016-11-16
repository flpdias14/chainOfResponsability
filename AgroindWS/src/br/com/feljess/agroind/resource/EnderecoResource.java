package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.EnderecoController;
import br.com.feljess.agroind.model.Endereco;

/**
 * 
 * Classe EnderecoResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:53:02 15 de nov de 2016
 * @version 1.0
 */
@Path("/endereco")
public class EnderecoResource {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:53:09
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Endereco> listarTodos(){
		
		return EnderecoController.listarTodos();
	}
}
