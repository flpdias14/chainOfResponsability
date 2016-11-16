package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Tecnico;

/**
 * 
 * Classe TecnicoDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 11:32:34 15 de nov de 2016
 * @version 1.0
 */
public class TecnicoDAO extends ConnectionFactory{
	
	private static TecnicoDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe TecnicoDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 11:35:27
	 * @version 1.0
	 */
	private TecnicoDAO(){
		
	}
	/**
	 * 
	 * Método responsável por retornar uma instancia da classe TecnicoDAO (Singleton)
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 11:32:49
	 * @version 1.0
	 * @return
	 */
	public static TecnicoDAO getInstancia(){
		if (instancia == null) {
			instancia = new TecnicoDAO();
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por listar todas as unidades.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 11:33:24
	 * @version 1.0
	 * @return
	 */
	public ArrayList<Tecnico> listarTodos(){
		ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
		Connection conexao = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		conexao = criarConexao();
		String sql = "select * from TECNICOS order by nome;";
		try {
			
			preparedStatement = conexao.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				Tecnico tecnico = new Tecnico();
				
				tecnico.setId(rs.getInt("ID"));
				tecnico.setIsBloqueado(rs.getBoolean("ISBLOQUEADO"));
				tecnico.setNome(rs.getString("NOME"));
				tecnicos.add(tecnico);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos os técnicos: "+ e);
			e.printStackTrace();
		}
		
		return tecnicos;
	}
}
