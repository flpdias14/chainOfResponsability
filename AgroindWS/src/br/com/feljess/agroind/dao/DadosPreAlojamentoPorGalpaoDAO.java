package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.DadosPreAlojamentoPorGalpao;
/**
 * 
 * Classe DadosPreAlojamentoPorGalpaoDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:58:04 15 de nov de 2016
 * @version 1.0
 */
public class DadosPreAlojamentoPorGalpaoDAO extends ConnectionFactory{
	
	private static DadosPreAlojamentoPorGalpaoDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe DadosPreAlojamentoPorGalpaoDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:58:09
	 * @version 1.0
	 */
	private DadosPreAlojamentoPorGalpaoDAO(){}
	
	/**
	 * 
	 * Método responsável por retornar uma instância da Classe DadosPreAlojamentoPorGalpao.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:58:13
	 * @version 1.0
	 * @return
	 */
	public static DadosPreAlojamentoPorGalpaoDAO getInstancia(){
		if(instancia == null){
			instancia = new DadosPreAlojamentoPorGalpaoDAO();
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por consultar e listar todos os pré alojamentos por galpáo.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:58:46
	 * @version 1.0
	 * @return
	 */
	public ArrayList<DadosPreAlojamentoPorGalpao> listarTodos(){
		ArrayList<DadosPreAlojamentoPorGalpao> dados = new ArrayList<DadosPreAlojamentoPorGalpao>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from  DADOSPREALOJAMENTOPORGALPAO;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				dados.add(new DadosPreAlojamentoPorGalpao(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos os pré-alojamentos: "+e);
			e.printStackTrace();
		}
		
		return dados;
	}
}
