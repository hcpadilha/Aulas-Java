package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servico.ServicoLogin;

@WebServlet("/TesteServlet")
public class TesteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TesteServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		ServicoLogin servico = new ServicoLogin();
		
		if(servico.verificarLogin(usuario, senha)) {
			response.sendRedirect("menu.html");
		}else {
			response.sendRedirect("erro.html");
		}
		
	}

}
