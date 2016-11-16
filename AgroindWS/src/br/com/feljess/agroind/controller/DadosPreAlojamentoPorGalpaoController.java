package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.DadosPreAlojamentoPorGalpaoDAO;
import br.com.feljess.agroind.model.DadosPreAlojamentoPorGalpao;

/**
 * 
 * Classe DadosPreAlojamentoPorGalpaoController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:03:22 15 de nov de 2016
 * @version 1.0
 */
public class DadosPreAlojamentoPorGalpaoController {
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:03:25
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<DadosPreAlojamentoPorGalpao> listarTodos(){
		return DadosPreAlojamentoPorGalpaoDAO.getInstancia().listarTodos();
	}
}
