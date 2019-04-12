package com.agenda.dao;

import java.sql.SQLException;

import java.sql.PreparedStatement;
import com.agenda.modelo.Pessoa;
import com.agenda.util.ConnectionFactory;
import com.mysql.jdbc.Connection;
public class PessoaDAO {
	
	private Connection connection;
	
	public void recebe(Pessoa pessoa) {
		
		String SQL = "insert into pessoas (nome, email, endereco, telefone) values (?,?,?,?)";
		
		
	try {
		
		this.connection = new ConnectionFactory().getConnetion();
		PreparedStatement stmt = this.connection.prepareStatement(SQL);
		
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getEmail());
		stmt.setString(3, pessoa.getEnd());
		stmt.setString(4, pessoa.getPhone());
		
		stmt.execute();
		stmt.close();
		
	}catch (SQLException e) {
		throw new RuntimeException(e);
	}
	}

}
