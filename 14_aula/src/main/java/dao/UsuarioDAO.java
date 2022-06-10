package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class UsuarioDAO {
	Connection cnx = null;
	
	public Usuario consultarUsuario(String login, String senha) {
		Usuario usuario = null;
		ResultSet rs = null;
		
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_usuario WHERE usuario = ? AND senha = ?";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			ps.setString(1, login);
			ps.setString(2, senha);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				usuario = new Usuario();
				
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}
	
	public List<Usuario> listar(){
		List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
		ResultSet rs = null;
		Usuario usuario = null;
		
		cnx = DAO.createConnection();
		
		String sql = "SELECT * FROM tb_usuario";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				usuario = new Usuario();
				
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));
				
				listaDeUsuarios.add(usuario);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaDeUsuarios;
	}
}
