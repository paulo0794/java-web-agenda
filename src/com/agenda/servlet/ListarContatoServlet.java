package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import com.agenda.modelo.Pessoa;
import com.agenda.service.CadastroUsuarioService;


@WebServlet("/busca-contato")
public class ListarContatoServlet extends HttpServlet {

	private CadastroUsuarioService service;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		service = new CadastroUsuarioService();

		List<Pessoa> pessoas = this.service.buscaPessoas();

		request.setAttribute("pessoas", pessoas);
		request.getRequestDispatcher("listar_contato.jsp")
		.forward(request, response);
		}
		
	}


