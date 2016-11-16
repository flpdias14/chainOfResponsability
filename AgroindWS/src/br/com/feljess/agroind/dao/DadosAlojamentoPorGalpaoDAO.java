package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.DadosAlojamentoPorGalpao;

/**
 * 
 * Classe DadosAlojamentoPorGalpaoDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:56:11 15 de nov de 2016
 * @version 1.0
 */
public class DadosAlojamentoPorGalpaoDAO extends ConnectionFactory{
	
	private static DadosAlojamentoPorGalpaoDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe DadosAlojamentoPorGalpaoDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:56:20
	 * @version 1.0
	 */
	private DadosAlojamentoPorGalpaoDAO(){}
	
	
	/**
	 * 
	 * Método responsável por retornar uma instância da classe DadosAlojamentoPorGalpaoDAO. 
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:56:27
	 * @version 1.0
	 * @return
	 */
	public static DadosAlojamentoPorGalpaoDAO getInstancia(){
		if(instancia == null){
			instancia = new DadosAlojamentoPorGalpaoDAO();
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por consultar e listar todos os alojamentos por galpão.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:57:05
	 * @version 1.0
	 * @return
	 */
	public  ArrayList<DadosAlojamentoPorGalpao> listarTodos(){
		ArrayList<DadosAlojamentoPorGalpao> dados = new ArrayList<DadosAlojamentoPorGalpao>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from  DADOSALOJAMENTOPORGALPAO;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				dados.add(new DadosAlojamentoPorGalpao(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos os alojamentos por galpão: "+e);
			e.printStackTrace();
		}
		return dados;
	}
}
