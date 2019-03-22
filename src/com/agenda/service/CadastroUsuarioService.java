package com.agenda.service;

import com.agenda.dao.PessoaDAO;
import com.agenda.modelo.Pessoa;

public class CadastroUsuarioService {
	
	public void cadastra(Pessoa pessoa) {
		
		PessoaDAO dao = new PessoaDAO();
		
		dao.recebe(pessoa);

	}
	

}
