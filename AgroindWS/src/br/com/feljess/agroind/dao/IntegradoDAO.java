package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Integrado;
import br.com.feljess.agroind.model.Pessoa;

/**
 * 
 * Classe IntegradoDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 16:52:04 24 de nov de 2016
 * @version 1.0
 */
public class IntegradoDAO extends ConnectionFactory{
	
	
	private static IntegradoDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe IntegradoDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 24 de nov de 2016 16:52:18
	 * @version 1.0
	 */
	private IntegradoDAO(){}
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 24 de nov de 2016 16:52:22
	 * @version 1.0
	 * @return
	 */
	public static IntegradoDAO getInstancia(){
		if(instancia == null){
			instancia = new IntegradoDAO();
		}
		return instancia;
	}
	
	public ArrayList<Integrado> listarTodos(){
		ArrayList<Integrado> integrados = new ArrayList<Integrado>();
		
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from PESSOA where ISINTEGRADO='true';";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				integrados.add(new Integrado(new Pessoa(rs)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return integrados;
	}
}
