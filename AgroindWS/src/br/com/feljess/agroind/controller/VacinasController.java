package br.com.feljess.agroind.controller;

import java.util.ArrayList;

import br.com.feljess.agroind.dao.VacinasDao;
import br.com.feljess.agroind.model.Vacinas;

public class VacinasController {
	
	
	public static ArrayList<Vacinas> listarTodos(){
		return VacinasDao.getInstancia().listarTodos();
	}

}
