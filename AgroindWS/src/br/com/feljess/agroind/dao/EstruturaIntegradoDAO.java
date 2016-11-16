package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.EstruturaIntegrado;

/**
 * 
 * Classe EstruturaIntegradoDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 13:03:45 15 de nov de 2016
 * @version 1.0
 */
public class EstruturaIntegradoDAO extends ConnectionFactory{

	private static EstruturaIntegradoDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe EstruturaIntegradoDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 13:03:40
	 * @version 1.0
	 */
	private EstruturaIntegradoDAO(){}
	
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 13:03:35
	 * @version 1.0
	 * @return
	 */
	public static EstruturaIntegradoDAO getInstancia(){
		if(instancia == null){
			instancia =  new EstruturaIntegradoDAO();
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 13:03:29
	 * @version 1.0
	 * @return
	 */
	public ArrayList<EstruturaIntegrado> listarTodos(){
		ArrayList<EstruturaIntegrado> estruturas = new ArrayList<EstruturaIntegrado>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from ESTRUTURAINTEGRADO;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				estruturas.add(new EstruturaIntegrado(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar estruturas do integrado: "+e);
			e.printStackTrace();
		}
		return estruturas;
	}
	
}
