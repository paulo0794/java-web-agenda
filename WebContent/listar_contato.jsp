<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Cadastro</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-success">
		<a class="navbar-brand">Agenda</a>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="index.html">Home <span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link"
					href="cadastropessoas.html">Cadastrar <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item active"><a class="nav-link"
					href="listar_contato.html">Contatos <span class="sr-only">(current)</span></a>
				</li>
		</div>
	</nav>

	<div class="container">

		<h1 class="text-center">Lista de Contatos</h1>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Nome</th>
					<th scope="col">Telefone</th>
					<th scope="col">E-mail</th>
					<th scope="col">EndereÃ§o</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="pessoa" items="${pessoas}">
				<tr>
					<td>${pessoa.nome}</td>
					<td>${pessoa.email}</td>
					<td>${pessoa.end}</td>
					<td>${pessoa.phone}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script src="js/jquery.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/inputMask.js"></script>

</body>
</html>