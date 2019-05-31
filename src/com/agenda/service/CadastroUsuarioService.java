package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.modelo.Pessoa;

public class CadastroUsuarioService {

	private PessoaDAO dao = new PessoaDAO();

	public List<Pessoa> buscaPessoas() {
		return this.dao.buscaPessoas();
	}

	public void removeContato(Pessoa pessoa) {
		this.dao.remove(pessoa);
	}

	public void cadastrarOuAlterar(Pessoa pessoa) {
		if (0 != pessoa.getId()) {
			this.dao.alterar(pessoa);
		} else {
			this.dao.recebe(pessoa);
		}

	}

}
