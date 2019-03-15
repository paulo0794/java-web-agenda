package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.modelo.Pessoa;

public class CadastroUsuarioServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getParameter("name");
		request.getParameter("phone");
		request.getParameter("mail");
		request.getParameter("end");
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("name"));
		pessoa.setPhone(request.getParameter("phone"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setEnd(request.getParameter("end"));
		
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("mail"));
		System.out.println(request.getParameter("end"));
	}
}
