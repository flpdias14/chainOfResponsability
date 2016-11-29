package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import br.com.feljess.agroind.controller.DadosPreAlojamentoPorGalpaoController;

import br.com.feljess.agroind.model.DadosPreAlojamentoPorGalpao;

/**
 * 
 * Classe DadosPreAlojamentoPorGalpaoResource.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:53:27 15 de nov de 2016
 * @version 1.0
 */
@Path("/dadosPreAlojamento")
public class DadosPreAlojamentoPorGalpaoResource {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:53:32
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public  ArrayList<DadosPreAlojamentoPorGalpao> listarTodos(){
		return DadosPreAlojamentoPorGalpaoController.listarTodos();
	}
}
