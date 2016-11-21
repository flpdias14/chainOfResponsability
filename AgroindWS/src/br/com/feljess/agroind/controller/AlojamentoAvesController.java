package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.AlojamentoAvesDao;
import br.com.feljess.agroind.model.AlojamentoAves;

/**
 * 
 * Classe AlojamentoAvesController.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:50:48 21 de nov de 2016
 * @version 1.0
 */
public class AlojamentoAvesController {
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 15:50:52
	 * @version 1.0
	 * @return
	 */
	public static ArrayList<AlojamentoAves> listarTodos(){
		return AlojamentoAvesDao.getInstancia().listarTodos();
	}
}
