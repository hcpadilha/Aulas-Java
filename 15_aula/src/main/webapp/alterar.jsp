<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Tela de inclusão</title>
</head>
<body>
	<div>
		<form action="AlterarUsuarioServlet" method="post">
			<label>Nome : </label>
			<input type="text" name="nome" id="nome" placeholder="Nome do Usuário" size="40"/><br>
			<label>Usuário:</label>
			<input type="text" name="usuario" id="usuario" placeholder="Login para o usuário" size="20"/><br>
			<label>Senha:</label>
			<input type="password" name="senha" id="senha" placeholder="Senha" size="20"/><br>
			<input type="submit" value="Gravar"/>
		</form>
	</div>
	<div>
		<nav>
			<ul>
				<li><a href="menu.jsp">Home</a></li>
			</ul>
		</nav>
	</div>	
</body>
</html>