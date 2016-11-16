package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.EstruturaIntegradoDAO;
import br.com.feljess.agroind.model.EstruturaIntegrado;

/**
 * 
 * Classe EstruturaIntegradoController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 13:07:25 15 de nov de 2016
 * @version 1.0
 */
public class EstruturaIntegradoController {
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 13:07:21
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<EstruturaIntegrado> listarTodos(){
		return EstruturaIntegradoDAO.getInstancia().listarTodos();
	}

}
