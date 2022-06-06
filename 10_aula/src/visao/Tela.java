package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import util.Util;

public class Tela {
	public Cliente desenharIncluir() {

		Scanner teclado = new Scanner(System.in);
		String nome, telefone;
		int idade;
		Cliente cliente = new Cliente();

		System.out.println("Digite o nome do cliente: ");
		nome = teclado.next();

		System.out.println("Digite o telefone: ");
		telefone = teclado.next();

		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();

		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setIdade(idade);

		return cliente;
	}

	public void listarCliente(List<Cliente> banco) {
		for (Cliente c : banco) {
			String x = c.getNome();
			System.out.println(banco.indexOf(c) + " " + c.getNome() + " " + c.getTelefone() + " " + c.getIdade());

		}
	}

	public void exibirMedia(List<Cliente> banco) {
		Util util = new Util();

		System.out.println("A m�dia das idades �: " + util.calcularMedia(banco));
	}
	
	
	public Cliente alterarCliente(List<Cliente> banco) {
		Scanner teclado = new Scanner(System.in);
		int i;
		String nome, telefone;
		int idade;
		
		System.out.println("Qual indice voc� deseja alterar? ");
		i = teclado.nextInt();
		
		Cliente novoCliente = banco.get(i);
		
		System.out.println("Digite o nome do cliente: ");
		nome = teclado.next();
		
		System.out.println("Digite o telefone: ");
		telefone = teclado.next();
		
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		
		novoCliente.setNome(nome);
		novoCliente.setTelefone(telefone);
		novoCliente.setIdade(idade);
		
		return  novoCliente;
	}
	
	public int excluirCliente(List<Cliente> banco) {
		int i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual indice voc� deseja excluir?");
		i = teclado.nextInt();
		return i;
	}
	
	public void classificarCliente(List<Cliente> banco) {
		Scanner teclado = new Scanner(System.in);
		int i;
		int estrelas;
		
		System.out.println("Qual o indice do cliente voc� deseja classificar?");
		i = teclado.nextInt();
		
		Cliente novaClass = banco.get(i);
		
		System.out.println("Quantas estrelas voc� deseja clissificar?");
		estrelas = teclado.nextInt();
		
		novaClass.setEstrelas(estrelas);
	}
	public void clienteMaster(List<Cliente> banco) {
		for(Cliente c: banco) {
			if(c.getEstrelas() >= 4) {
				System.out.println("O cliente master �: " + c.getNome());
				
			}
		}
	}
	

}
