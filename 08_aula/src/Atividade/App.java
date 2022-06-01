package Atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		App app = new App();
		String nome;
		String telefone;
		int idade;
		int resposta;
		Cliente cliente; 
		Cliente classCliente;

		List<Cliente> banco = new ArrayList<Cliente>();

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("------MENU------");
			System.out.println("1- Ler cliente");
			System.out.println("2-lista de clientes");
			System.out.println("3-Média da idadade do cliente");
			System.out.println("4-Alterar cliente");
			System.out.println("5-Excluir cliente");
			System.out.println("6- Classificar cliente");
			System.out.println("7- Listar cliente master");
			System.out.println("8-Fim");
			System.out.println("----------------");
			System.out.println("Digite uma opção:");
			resposta = teclado.nextInt();

			if (resposta == 1) {
				cliente = new Cliente();
				
				System.out.println("Digite o nome do cliente: ");
				nome = teclado.next();
				
				System.out.println("Digite o telefone: ");
				telefone = teclado.next();
				
				System.out.println("Digite a idade: ");
				idade = teclado.nextInt();
				
				cliente.setNome(nome);
				cliente.setTelefone(telefone);
				cliente.setIdade(idade);
				
				banco.add(cliente);
				
			}else if(resposta == 2) {
				for(Cliente c: banco) {
					System.out.println(c);
				}

			}else if(resposta == 3) {
				
				double somaIdade = 0;
				for(Cliente c: banco){
					somaIdade += c.getIdade();
					
				}
				System.out.println(somaIdade / banco.size());
				
			}else if(resposta == 5) {
				System.out.println("Qual indice você deseja excluir?");
				banco.remove(teclado.nextInt());
				
			}else if(resposta == 4) {
				int i;
				
				System.out.println("Qual indice você deseja alterar? ");
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
				
				banco.add(novoCliente);
				
			}else if(resposta == 6) {
				int i;
				int estrelas;
				
				System.out.println("Qual o indice do cliente você deseja classificar?");
				i = teclado.nextInt();
				
				Cliente novaClass = banco.get(i);
				
				System.out.println("Quantas estrelas você deseja clissificar?");
				estrelas = teclado.nextInt();
				
				novaClass.setEstrelas(estrelas);
					
			}else if(resposta == 7) {
				for(Cliente c: banco) {
					if(c.getEstrelas() >= 4) {
						System.out.println("O cliente master é: " + c.getNome());
						
					}
				}
			}
			
		} while (resposta < 8);
		System.out.println("Fim do programa!");

	}
	
	/*public double calcularMedia(List<Cliente> lista) {
		int somaIdade = 0;
		
		for(Cliente c: lista) {
			somaIdade += c.getIdade();
		}
		return (somaIdade / lista.size());
}*/
}
