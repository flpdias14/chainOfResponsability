package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.UnidadesDAO;
import br.com.feljess.agroind.model.Unidades;

/**
 * 
 * Classe UnidadesController.java responsavel por controlar as requisições
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 11:30:58 15 de nov de 2016
 * @version 1.0
 */
public class UnidadesController {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:02:29
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<Unidades> listarTodos(){
		return UnidadesDAO.getInstancia().listarTodos();
	}
}
