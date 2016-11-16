package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.ProdutosController;
import br.com.feljess.agroind.model.Produtos;
/**
 * 
 * Classe ProdutosResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:51:46 15 de nov de 2016
 * @version 1.0
 */
@Path("/produtos")
public class ProdutosResource {
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:51:42
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Produtos> listarTodos(){
		return ProdutosController.listarTodos();
	}
}
