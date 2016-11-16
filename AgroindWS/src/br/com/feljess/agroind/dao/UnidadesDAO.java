package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Unidades;

/**
 * 
 * Classe UnidadesDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 11:32:17 15 de nov de 2016
 * @version 1.0
 */
public class UnidadesDAO extends ConnectionFactory{
	
	private static UnidadesDAO instancia;
	
	private UnidadesDAO(){
		
	}
	/**
	 * 
	 * Método responsável por retornar uma instancia da classe UnidadesDAO
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 11:34:01
	 * @version 1.0
	 * @return
	 */
	public static UnidadesDAO getInstancia(){
		if (instancia == null){
			instancia = new UnidadesDAO();
		}
		return instancia;
	}
	
	public ArrayList<Unidades> listarTodos(){
		ArrayList<Unidades> unidades = new ArrayList<Unidades>();
		Connection conexao = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		conexao = criarConexao();
		String sql = "select * from UNIDADES order by UNIDADES.NOMEFANTASIA;";
		try {
			preparedStatement = conexao.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				unidades.add(new Unidades(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todas as unidades: "+e);
			e.printStackTrace();
		}
		
		
		return unidades;
	}

}
