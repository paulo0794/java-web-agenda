package com.agenda.dao;

import com.agenda.modelo.Pessoa;

public class PessoaDAO {
	
	public void recebe(Pessoa pessoa) {
		
		String SQL = "insert into pessoas (nome, email, endereco, telefone) values (?,?,?,?)";
	}

}
