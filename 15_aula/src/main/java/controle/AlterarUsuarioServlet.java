package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import servico.UsuarioServico;

@WebServlet("/AlterarUsuarioServlet")
public class AlterarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlterarUsuarioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usr = new Usuario();
		UsuarioServico servico = new UsuarioServico();
		
		usr.setId(Integer.parseInt(request.getParameter("id")));
		usr.setNome(request.getParameter("nome"));
		usr.setUsuario(request.getParameter("usuario"));
		usr.setSenha(request.getParameter("senha"));
		
		if(servico.alterar(usr)) {
			response.sendRedirect("menu.jsp");
		}		
	}

}
