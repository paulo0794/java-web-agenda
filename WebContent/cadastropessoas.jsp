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
					href="cadastropessoas.jsp">Cadastrar <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item active"><a class="nav-link"
					href="busca-contato">Contatos <span class="sr-only">(current)</span></a>
				</li>
		</div>
	</nav>

	<div class="container">
		<h1 class="text-center">Cadastro</h1>
		<form action="cadastra-usuario">
		
			<input type="hidden" id="id" name="id" value="${param.id}">
			
			<div class="form-group">
				<label for="name">Nome</label> <input value="${param.nome}" name="name" type="text"
					class="form-control" id="name">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="phone">Telefone</label> <input value="${param.phone}" name="phone" type="tel"
						data-mask="(99)99999-9999" class="form-control" id="phone">
				</div>

				<div class="form-group col-md-6">
					<label for="phone">E-mail</label> <input value="${param.email}" name="email" type="email"
						class="form-control" id="email">
				</div>
			</div>
			<div class="form-group">
				<label for="end">Endereço</label> <input value="${param.end}" name="end" type="text"
					class="form-control" id="end">
			</div>
			<button type="submit" class="btn btn-dark">Enviar</button>

			<a class="btn btn-warning" href="index.html">Voltar</a>
		</form>
	</div>

	<script src="js/jquery.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/inputMask.js"></script>

</body>
</html>