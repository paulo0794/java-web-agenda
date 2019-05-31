package com.agenda.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.agenda.modelo.Pessoa;
import com.agenda.util.ConnectionFactory;
import com.mysql.jdbc.Connection;

public class PessoaDAO {

	private Connection connection;
	private PreparedStatement stmt;

	public PessoaDAO(){
		this.connection = ConnectionFactory().getConnetion();
	}
	
	
	public void recebe(Pessoa pessoa) {

		String SQL = "insert into pessoas (nome, email, endereco, telefone) values (?,?,?,?)";

		try {
			
			this.stmt = this.connection.prepareStatement(SQL);

			this.stmt.setString(1, pessoa.getNome());
			this.stmt.setString(2, pessoa.getEmail());
			this.stmt.setString(3, pessoa.getEnd());
			this.stmt.setString(4, pessoa.getPhone());

			this.stmt.execute();
			this.stmt.close();

			buscaPessoas();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Pessoa> buscaPessoas() {

		String SQL = "select * from pessoas";

		try {

			this.stmt = this.connection.prepareStatement(SQL);

			List<Pessoa> pessoas = new ArrayList<Pessoa>();

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setId(rs.getInt("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setEnd(rs.getString("endereco"));
				pessoa.setPhone(rs.getString("telefone"));

				pessoas.add(pessoa);

			}

			this.stmt.close();
			this.connection.close();
			return pessoas;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Pessoa pessoa) {

		String SQL = "delete from pessoas where id=?";
		try {

			this.stmt = this.connection.prepareStatement(SQL);
			
			this.stmt.setInt(1, pessoa.getId());
			this.stmt.execute();
			this.stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void alterar(Pessoa pessoa) {
		String SQL = "update pessoas set nome=?, email=?, endereco=?, telefone=? where id=?";

		try {

			this.stmt = this.connection.prepareStatement(SQL);

			this.stmt.setString(1, pessoa.getNome());
			this.stmt.setString(2, pessoa.getEmail());
			this.stmt.setString(3, pessoa.getEnd());
			this.stmt.setString(4, pessoa.getPhone());
			this.stmt.setInt(5, pessoa.getId());
			this.stmt.execute();
			this.stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
