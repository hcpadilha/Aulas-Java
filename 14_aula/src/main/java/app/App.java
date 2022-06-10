package app;

import java.util.List;

import dao.UsuarioDAO;
import modelo.Usuario;

public class App {

	public static void main(String[] args) {
		List<Usuario> lista;
		
		UsuarioDAO dao = new UsuarioDAO();
		
		lista = dao.listar();
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}

}
