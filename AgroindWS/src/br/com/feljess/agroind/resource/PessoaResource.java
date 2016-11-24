package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.PessoaController;
import br.com.feljess.agroind.model.Pessoa;

@Path("/pessoa")
public class PessoaResource {
	
	
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Pessoa> listarTodos(){
		return PessoaController.listarTodos();
	}
}
