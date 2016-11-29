package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.PreAlojamento;
/**
 * 
 * Classe PreAlojamentoDao.java responsável por realizar consultas e alterações referentes a informações de Pre Alojamento 
 * no banco de Dados.
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 16:54:15 29 de nov de 2016
 * @version 1.0
 */
public class PreAlojamentoDao extends ConnectionFactory{

	
	private static PreAlojamentoDao instancia;
	
	/**
	 * 
	 * Construtor privado da Classe PreAlojamentoDao.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 29 de nov de 2016 16:54:28
	 * @version 1.0
	 */
	private PreAlojamentoDao(){}
	
	/**
	 * 
	 * Método responsável por retornar uma instância da classe PreAlojamentoDao.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 29 de nov de 2016 16:54:32
	 * @version 1.0
	 * @return
	 */
	public static PreAlojamentoDao getInstancia(){
		if (instancia == null) {
			instancia = new PreAlojamentoDao();
		}
		return instancia;
	}
	
	
	/**
	 * 
	 * Método responsável por listar todos os pré alojamentos Cadastrados 
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 29 de nov de 2016 16:54:38
	 * @version 1.0
	 * @return
	 */
	public ArrayList<PreAlojamento> listarTodos(){
		ArrayList<PreAlojamento> preAlojamentos = new ArrayList<PreAlojamento>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = " select * from PREALOJAMENTOAVES;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				preAlojamentos.add(new PreAlojamento(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return preAlojamentos;
	}
}
