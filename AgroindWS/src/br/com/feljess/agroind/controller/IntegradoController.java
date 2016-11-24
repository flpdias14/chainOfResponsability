package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.IntegradoDAO;
import br.com.feljess.agroind.model.Integrado;
/**
 * 
 * Classe IntegradoController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 16:54:47 24 de nov de 2016
 * @version 1.0
 */
public class IntegradoController {

	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 24 de nov de 2016 16:54:50
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<Integrado> listarTodos(){
		return IntegradoDAO.getInstancia().listarTodos();
	}
}
