package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.PessoaDAO;
import br.com.feljess.agroind.model.Pessoa;
/**
 * 
 * Classe PessoaController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 21:35:39 23 de nov de 2016
 * @version 1.0
 */
public class PessoaController {
	
	
	public static ArrayList<Pessoa> listarTodos(){
		return PessoaDAO.getInsancia().listarTodos();
	}
}
