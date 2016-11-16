package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.ProdutosDAO;
import br.com.feljess.agroind.model.Produtos;

/**
 * 
 * Classe ProdutosController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:02:44 15 de nov de 2016
 * @version 1.0
 */
public class ProdutosController {
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:02:48
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<Produtos> listarTodos(){
		return ProdutosDAO.getInstancia().listarTodos();
	}
}
