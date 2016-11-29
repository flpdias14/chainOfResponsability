package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.PreAlojamentoDao;
import br.com.feljess.agroind.model.PreAlojamento;

/**
 * 
 * Classe PreAlojamentoController.java responsável por controlar o acesso aos métodos de consulta e alteração dos dados de Pre Alojamento no banco de Dados.
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 16:57:41 29 de nov de 2016
 * @version 1.0
 */
public class PreAlojamentoController {
	
	/**
	 * 
	 * Método responsável por controlar o acesso ao método listarTodos da Classe PreAlojamentoDao.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 29 de nov de 2016 16:58:47
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<PreAlojamento> listarTodos(){
		return PreAlojamentoDao.getInstancia().listarTodos();
	}
}
