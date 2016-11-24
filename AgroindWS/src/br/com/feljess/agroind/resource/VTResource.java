package br.com.feljess.agroind.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.feljess.agroind.controller.AlojamentoAvesController;
import br.com.feljess.agroind.controller.ContatoController;
import br.com.feljess.agroind.controller.DadosAlojamentoPorGalpaoController;
import br.com.feljess.agroind.controller.DadosPreAlojamentoPorGalpaoController;
import br.com.feljess.agroind.controller.EnderecoController;
import br.com.feljess.agroind.controller.EstruturaIntegradoController;
import br.com.feljess.agroind.controller.GrupoProdutosController;
import br.com.feljess.agroind.controller.IntegradoController;
import br.com.feljess.agroind.controller.PessoaController;
import br.com.feljess.agroind.controller.ProdutosController;
import br.com.feljess.agroind.controller.TecnicoController;
import br.com.feljess.agroind.controller.UnidadesController;
import br.com.feljess.agroind.controller.VacinasController;
import br.com.feljess.agroind.model.VT;

/**
 * 
 * Classe VTResource.java responsável por fazer a listagem de todos os objetos necessários na visita técnica.
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 21:12:56 23 de nov de 2016
 * @version 1.0
 */
@Path("vtResource")
public class VTResource {
	
	/**
	 * 
	 * Método responsável por listar todos os objetos necessários para a visita técnica.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 23 de nov de 2016 21:13:34
	 * @version 1.0
	 * @return
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public VT listarTodos(){
		VT vt = new VT();
		vt.setAlojamentoAves(AlojamentoAvesController.listarTodos());
		vt.setContato(ContatoController.listarTodos());
		vt.setDadosAlojamentoPorGalpaos(DadosAlojamentoPorGalpaoController.listarTodos());
		vt.setDadosPreAlojamentoPorGalpaos(DadosPreAlojamentoPorGalpaoController.listarTodos());
		vt.setEnderecos(EnderecoController.listarTodos());
		vt.setEstruturaIntegrados(EstruturaIntegradoController.listarTodos());
		vt.setGrupoProdutos(GrupoProdutosController.listarTodos());
		vt.setProdutos(ProdutosController.listarTodos());
		vt.setTecnicos(TecnicoController.listarTodos());
		vt.setUnidades(UnidadesController.listarTodos());
		vt.setVacinas(VacinasController.listarTodos());
		vt.setPessoas(PessoaController.listarTodos());
		vt.setIntegrados(IntegradoController.listarTodos());
			
		return vt;
	}
}
