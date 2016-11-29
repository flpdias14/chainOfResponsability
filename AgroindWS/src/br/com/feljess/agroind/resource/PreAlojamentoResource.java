package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.PreAlojamentoController;
import br.com.feljess.agroind.model.PreAlojamento;

/**
 * 
 * Classe PreAlojamentoResource.java 
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 17:02:16 29 de nov de 2016
 * @version 1.0
 */
@Path("/preAlojamento")
public class PreAlojamentoResource {
	
	/**
	 * 
	 * Método responsável por criar o servico público de acesso ao médoto listar todos da classe PreAlojamentoDao.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 29 de nov de 2016 17:01:28
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<PreAlojamento> listarTodos(){
		return PreAlojamentoController.listarTodos();
	}

}
