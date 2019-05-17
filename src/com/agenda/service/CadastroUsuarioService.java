package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.modelo.Pessoa;

public class CadastroUsuarioService {
	
	public void cadastra(Pessoa pessoa) {
		
		PessoaDAO dao = new PessoaDAO();
		
		dao.recebe(pessoa);
		
	}
	
	public List<Pessoa> buscaPessoas() {
		
		PessoaDAO dao = new PessoaDAO();
		return dao.buscaPessoas();
	}

	public void removeContato(Pessoa Pessoa) {
		PessoaDAO dao = new PessoaDAO();
		dao.remove(Pessoa);
		
	}
	
	public void alterar(Pessoa pessoa) {

		PessoaDAO dao = new PessoaDAO();
		dao.alterar(pessoa);
	}
	

}
