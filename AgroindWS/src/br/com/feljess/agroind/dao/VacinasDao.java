package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Vacinas;
/**
 * 
 * Classe VacinasDao.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:58:07 21 de nov de 2016
 * @version 1.0
 */
public class VacinasDao extends ConnectionFactory {
	
	private static VacinasDao instancia;
	
	/**
	 * 
	 * Construtor da Classe VacinasDao.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 14:58:18
	 * @version 1.0
	 */
	private VacinasDao(){}
	
	/**
	 * 
	 * Método responsável por retornar uma instancia da classe VacinasDao.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 14:58:22
	 * @version 1.0
	 * @return
	 */
	public static VacinasDao getInstancia(){
		if (instancia == null) {
			instancia = new VacinasDao();
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por listar consultar e listar todas as Vacinass.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 14:58:33
	 * @version 1.0
	 * @return
	 */
	public ArrayList<Vacinas> listarTodos(){
		ArrayList<Vacinas> vacinas = new ArrayList<Vacinas>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		// Falta Adicionar a query 
//		String sql = "select * from  ;";
		
		try {
		//	preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				vacinas.add(new Vacinas(rs));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos as vacinas: "+e);
			e.printStackTrace();
		}

		
		return vacinas;
	}
	
}
