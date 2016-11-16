package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Produtos;
/**
 * 
 * Classe ProdutosDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 15:00:43 15 de nov de 2016
 * @version 1.0
 */
public class ProdutosDAO extends ConnectionFactory{
	
	private static ProdutosDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe ProdutosDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:00:47
	 * @version 1.0
	 */
	private ProdutosDAO(){}
	
	/**
	 * 
	 * Método responsável por retornar uma instancia da classe ProdutosDAO. 
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:00:51
	 * @version 1.0
	 * @return
	 */
	public static ProdutosDAO getInstancia(){
		if (instancia == null) {
			instancia = new ProdutosDAO(); 
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por consultar e listar todos os Protudos.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:01:16
	 * @version 1.0
	 * @return
	 */
	public ArrayList<Produtos> listarTodos(){
		ArrayList<Produtos> produtos = new  ArrayList<Produtos>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from  PRODUTOS;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				produtos.add(new Produtos(rs));
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos os produtos: "+e);
			e.printStackTrace();
		}
		return produtos;
	}
	
}
