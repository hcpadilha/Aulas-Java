<%@page import="dao.UsuarioDAO" %>
<%@page import="modelo.Usuario" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<%String nome = (String)session.getAttribute("usuarioSession"); %>
	<div>
		<h2>Bem vindo ao sistema, <%=nome %></h2>
	</div>

	<div>
		<table border=1>
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>USUÁRIO</th>
				<th colspan=2></th>
			</tr>

			<%
	UsuarioDAO dao = new UsuarioDAO();
			
	List<Usuario> lista = new ArrayList<Usuario>();
	
	lista = dao.listar();
	
	for(Usuario usuario: lista){%>
	
		<tr>
		
			<td>
				<%=usuario.getId()%>
			</td>

			<td><%=usuario.getNome()%>
			
			</td>

			<td><%=usuario.getUsuario()%>
			
			</td>
			<td>
				<img src="images/edit.png" width="24px"/>
			</td>
			<td>
				<a href="delete.jsp?id=<%=usuario.getId()%>"><img src="images/del.jpg" width="24px"/></a>
			</td>
		
			</tr>
	<% 
	}
	%>

		</table>
			<div>
				<nav>
					<ul>
					<li><a href="index.html">Logout</a><li>
					</ul>
				</nav>
			</div>
		</div>
	</body>
</html>