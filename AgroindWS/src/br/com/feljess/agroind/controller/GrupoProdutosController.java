package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.GrupoProdutosDAO;
import br.com.feljess.agroind.model.GrupoProdutos;
/**
 * 
 * Classe GrupoProdutosController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:17:06 15 de nov de 2016
 * @version 1.0
 */
public class GrupoProdutosController {
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:17:09
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<GrupoProdutos> listarTodos(){
		return GrupoProdutosDAO.getIntancia().listarTodos();
	}
}
