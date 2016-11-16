package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.UsuariosDAO;
import br.com.feljess.agroind.model.Usuarios;

/**
 * 
 * Classe UsuariosController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 12:24:19 15 de nov de 2016
 * @version 1.0
 */
public class UsuariosController {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 12:24:22
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<Usuarios> listarTodos(){
		return UsuariosDAO.getInstancia().listarTodos();
	}

}
