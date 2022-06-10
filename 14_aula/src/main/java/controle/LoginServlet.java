package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsuarioDAO;
import modelo.Usuario;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		Usuario u = null;
		
		 HttpSession session = request.getSession();
		 
		UsuarioDAO dao = new UsuarioDAO();
		
		u = dao.consultarUsuario(usuario, senha);
		
		if(u != null) {
			session.setAttribute("usuarioSession", u.getNome());
			
			response.sendRedirect("menu.jsp");
		} else {
			response.sendRedirect("erro.jsp");
		}
	}

}
