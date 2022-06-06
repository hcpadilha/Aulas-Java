package servico;

public class ServicoLogin {
	public boolean verificarLogin(String usuario, String senha) {
		if (usuario.equals("admin") && senha.equals("123456")) {
			return true;
		} else {
			return false;
		}
	}
}
