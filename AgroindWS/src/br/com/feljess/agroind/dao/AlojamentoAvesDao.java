package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.AlojamentoAves;
/**
 * 
 * Classe AlojamentoAvesDao.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:49:11 21 de nov de 2016
 * @version 1.0
 */
public class AlojamentoAvesDao extends ConnectionFactory{
	
	private static AlojamentoAvesDao instancia;
	
	/**
	 * 
	 * Construtor da Classe AlojamentoAvesDao.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 15:49:17
	 * @version 1.0
	 */
	private AlojamentoAvesDao(){}
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 15:49:22
	 * @version 1.0
	 * @return
	 */
	public static AlojamentoAvesDao getInstancia(){
		if(instancia == null){
			instancia = new AlojamentoAvesDao();
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 21 de nov de 2016 15:49:29
	 * @version 1.0
	 * @return
	 */
	public ArrayList<AlojamentoAves> listarTodos(){
		ArrayList<AlojamentoAves> alojamentos = new ArrayList<AlojamentoAves>();
		Connection conexao = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		conexao = criarConexao();
		String sql = "select * from ALOJAMENTOAVES;";
		
		try {
			preparedStatement = conexao.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				alojamentos.add(new AlojamentoAves(rs));
			}
		} catch (Exception e) {
			System.out.println("Erro ao listar todos os alojamentos de aves: "+e);
			e.printStackTrace();
		}
		
		return alojamentos;
	}
	

}
