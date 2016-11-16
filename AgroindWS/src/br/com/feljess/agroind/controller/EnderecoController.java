package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.EnderecoDAO;
import br.com.feljess.agroind.model.Endereco;

/**
 * 
 * Classe EnderecoController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:03:04 15 de nov de 2016
 * @version 1.0
 */
public class EnderecoController {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:03:08
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<Endereco> listarTodos(){
		return EnderecoDAO.getInstancia().listarTodos();
	}
}
