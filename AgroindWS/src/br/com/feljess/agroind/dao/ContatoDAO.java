package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Contato;
/**
 * 
 * Classe ContatoDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:54:41 15 de nov de 2016
 * @version 1.0
 */
public class ContatoDAO extends ConnectionFactory{
	
	private static ContatoDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe ContatoDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:54:59
	 * @version 1.0
	 */
	private ContatoDAO(){}
	
	/**
	 * 
	 * Método responsável por retornar uma instancia da classe ContatoDAO 
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:55:11
	 * @version 1.0
	 * @return
	 */
	public static ContatoDAO getInstancia(){
		if(instancia == null){
			instancia = new ContatoDAO();
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por consultar e listar todos os contatos.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:55:38
	 * @version 1.0
	 * @return
	 */
	public  ArrayList<Contato> listarTodos(){
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		Connection conexao = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		conexao = criarConexao();
		String sql = "select * from CONTATO;";
		try {
			preparedStatement = conexao.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				contatos.add(new Contato(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos os contatos: "+e);
			e.printStackTrace();
		}
		
		return contatos;
		
	}
	
}
