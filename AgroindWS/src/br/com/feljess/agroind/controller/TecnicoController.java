package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.TecnicoDAO;
import br.com.feljess.agroind.model.Tecnico;

/**
 * 
 * Classe TecnicoController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 11:31:26 15 de nov de 2016
 * @version 1.0
 */
public class TecnicoController {
	
	/**
	 * 
	 * Método responsável por controlar as requisições do método listar todos.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 11:31:35
	 * @version 1.0
	 * @return
	 */
	public  static ArrayList<Tecnico> listarTodos(){
		return TecnicoDAO.getInstancia().listarTodos();
	}
}
