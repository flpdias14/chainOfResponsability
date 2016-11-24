package br.com.feljess.agroind.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.feljess.agroind.factory.ConnectionFactory;
import br.com.feljess.agroind.model.Pessoa;

public class PessoaDAO extends ConnectionFactory{

	
	private static PessoaDAO instancia;
	
	private PessoaDAO(){}
	
	public static PessoaDAO getInsancia(){
		if(instancia == null){
			instancia = new PessoaDAO();
		}
		return instancia;
	}
	
	public ArrayList<Pessoa> listarTodos(){
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Connection connection = criarConexao();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from PESSOA;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while(rs.next()){
				pessoas.add(new Pessoa(rs));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao listar todas as pessoas: "+e);
			e.printStackTrace();
		}
		
		return pessoas;
	}
}
