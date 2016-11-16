package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Usuarios;

/**
 * 
 * Classe UsuariosDAO.java
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 12:11:50 15 de nov de 2016
 * @version 1.0
 */
public class UsuariosDAO extends ConnectionFactory{
	
	
	private static UsuariosDAO instancia;
	/**
	 * 
	 * Construtor da Classe UsuariosDAO.java
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 12:11:59
	 * @version 1.0
	 */
	private UsuariosDAO(){}
	
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 12:22:25
	 * @version 1.0
	 * @return
	 */
	public static UsuariosDAO getInstancia(){
		if(instancia == null){
			instancia = new UsuariosDAO();
		}
		return instancia;
	}
	/**
	 * 
	 * Método responsável por
	 * @autor Felipe Oliveira
	 * @email flpdias14@gmail.com
	 * @sice 15 de nov de 2016 12:22:20
	 * @version 1.0
	 * @return
	 */
	public ArrayList<Usuarios> listarTodos(){
		ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
		Connection conexao = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql ="select * from USUARIOS";
		try {
			preparedStatement = conexao.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				usuarios.add(new Usuarios(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todos os usuários: "+ e);
			e.printStackTrace();
		}
		
		return usuarios;
	}
}
