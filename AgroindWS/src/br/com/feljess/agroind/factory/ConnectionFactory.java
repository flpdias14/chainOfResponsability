package br.com.feljess.agroind.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Classe responsável por criar e fechar conexões com o banco de dados.
 * @author Felipe Oliveira
 * @version 1.0
 */
public class ConnectionFactory {

	private static final String USUARIO = "root";
	private static final String SENHA = "27091954";
	private static final String URL = "jdbc:mysql://localhost/FELJESSAGROERP";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	/**
	 * Cria a conexão com o banco de dados.
	 * @return
	 */
	public  Connection criarConexao(){
		Connection connection = null;
		
		try {
			                       
			Class.forName(DRIVER);
			connection =  DriverManager.getConnection(URL, USUARIO, SENHA); 
            return connection;
 

		} catch (Exception e) {
			System.out.println("Erro ao conectar ao banco de dados: "+URL);
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public  void fecharConexao(Connection connection, PreparedStatement preparedStatement, ResultSet rs){
		
		try {
			if (connection != null) {
				//System.out.println("Fechanco a conecoa");
				connection.close();
			}
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao fechar o banco de dados: "+URL);
			e.printStackTrace();

		}
	}
	
	public static void main(String args[]){
		System.out.println("ConnectionFactory");
	}
	
}
