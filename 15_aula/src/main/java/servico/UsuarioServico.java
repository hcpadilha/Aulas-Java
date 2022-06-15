package servico;

import dao.UsuarioDAO;
import modelo.Usuario;

public class UsuarioServico {
	UsuarioDAO usuario = new UsuarioDAO();

	public boolean alterar(Usuario usr) {
		return usuario.alterarUsuario(usr);
	}

	public boolean incluir(Usuario usr) {
		return usuario.incluirUsuario(usr);
	}
	
	public boolean excluir(String id) {
		int idUsuario;
		
		idUsuario = Integer.parseInt(id);
		
		return usuario.excluirUsuario(idUsuario);
	}
}
