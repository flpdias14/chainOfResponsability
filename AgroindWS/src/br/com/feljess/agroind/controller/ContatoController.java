package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.ContatoDAO;
import br.com.feljess.agroind.model.Contato;

/**
 * 
 * Classe ContatoController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:03:48 15 de nov de 2016
 * @version 1.0
 */
public class ContatoController {
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:03:54
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<Contato> listarTodos(){
		return ContatoDAO.getInstancia().listarTodos();
	}

}
