package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Endereco;

/**
 * 
 * Classe EnderecoDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 14:59:29 15 de nov de 2016
 * @version 1.0
 */
public class EnderecoDAO extends ConnectionFactory {

	private static EnderecoDAO instancia;
	
	/**
	 * 
	 * Construtor da Classe EnderecoDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:59:34
	 * @version 1.0
	 */
	private EnderecoDAO(){}
	
	/**
	 * 
	 * Método responsável por retornar uma instância da classe EnderecoDAO.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 14:59:40
	 * @version 1.0
	 * @return
	 */
	public static EnderecoDAO getInstancia(){
		if(instancia == null){
			instancia = new EnderecoDAO();
		}
		return instancia;
	}
	
	/**
	 * 
	 * Método responsável por consultar e listar todos os enderecos.
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 15:00:04
	 * @version 1.0
	 * @return
	 */
	public ArrayList<Endereco> listarTodos(){
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from ENDERECO;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				enderecos.add(new Endereco(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos os endereços: "+e);
			e.printStackTrace();
		}
		return enderecos;
	}
}
