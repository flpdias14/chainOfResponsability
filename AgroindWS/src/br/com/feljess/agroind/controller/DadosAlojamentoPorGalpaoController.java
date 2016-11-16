package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.DadosAlojamentoPorGalpaoDAO;
import br.com.feljess.agroind.model.DadosAlojamentoPorGalpao;

/**
 * 
 * Classe DadosAlojamentoPorGalpaoController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:03:34 15 de nov de 2016
 * @version 1.0
 */
public class DadosAlojamentoPorGalpaoController {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:03:38
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<DadosAlojamentoPorGalpao> listarTodos(){
		return DadosAlojamentoPorGalpaoDAO.getInstancia().listarTodos();
	}

}
