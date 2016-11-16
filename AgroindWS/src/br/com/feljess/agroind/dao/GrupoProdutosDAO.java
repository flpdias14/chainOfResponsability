package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.GrupoProdutos;
/**
 * 
 * Classe GrupoProdutosDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:14:42 15 de nov de 2016
 * @version 1.0
 */
public class GrupoProdutosDAO extends ConnectionFactory{

	private static GrupoProdutosDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe GrupoProdutosDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:14:45
	 * @version 1.0
	 */
	private GrupoProdutosDAO(){}
	
	/**
	 * 
	 * Método responsável por retornar uma instancia da classe GrupoProdutosDAO.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:14:51
	 * @version 1.0
	 * @return
	 */
	public static GrupoProdutosDAO getIntancia(){
		if (instancia == null) {
			instancia = new GrupoProdutosDAO();
		}
		return instancia;
	}
	
	
	/**
	 * 
	 * Método responsável por consultar e listar todos os grupos de produtos.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:15:20
	 * @version 1.0
	 * @return
	 */
	public ArrayList<GrupoProdutos> listarTodos(){
		ArrayList<GrupoProdutos> grupos = new ArrayList<GrupoProdutos>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from GRUPOPRODUTO;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				grupos.add(new GrupoProdutos(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos os grupos de produtos: "+e);
			e.printStackTrace();
		}
	return grupos;
	}
	
}
