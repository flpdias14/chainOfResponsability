package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.GrupoProdutosController;
import br.com.feljess.agroind.model.GrupoProdutos;
/**
 * 
 * Classe GrupoProdutosResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:20:12 15 de nov de 2016
 * @version 1.0
 */
@Path("/grupoProdutos")
public class GrupoProdutosResource {

	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:20:43
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<GrupoProdutos> listarTodos(){
		return GrupoProdutosController.listarTodos();
	}
}
