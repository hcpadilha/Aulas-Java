package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import visao.Tela;

public class Controle {
	List<Cliente> banco = new ArrayList<Cliente>();

	public void avaliarOpcao(int resposta) {
		Tela tela = new Tela();

		if (resposta == 1) {

		
			
			tela.desenharIncluir();
			
			
			
			banco.add(tela.desenharIncluir());

		} else if (resposta == 2) {
			//Listar Cliente
			
			tela.listarCliente(banco);
			

		} else if (resposta == 3) {

			Tela.exibirMedia(banco);
					
			
	
		} else if (resposta == 5) {
			banco.remove(tela.excluirCliente(banco));

		} else if (resposta == 4) {
			

			banco.add(tela.alterarCliente(banco));

		} else if (resposta == 6) {
			tela.clasificarCliente(banco);

		} else if (resposta == 7) {
			tela.clienteMaster(banco);
		}
	}
}
