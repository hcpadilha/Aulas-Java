package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Carteira;

public class Tela {
	double saldo = 10.0;
	int resposta;
	String r02;
	String nome, senha, cpf;
	Carteira carteira = new Carteira();

	public Carteira cadastrar() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("------------CADASTRO-----------");
		System.out.println("Digite seu nome:");
		nome = teclado.next();
		System.out.println("Digite seu cpf: ");
		cpf = teclado.next();
		System.out.println("Digite sua senha: ");
		senha = teclado.next();

		carteira.setNome(nome);
		carteira.setSenha(senha);
		carteira.setCpf(cpf);
		carteira.setSaldo(saldo);
		
		 System.out.println("Você deseja realizar o login? (s/n)");
		 r02 = teclado.next();
		 if(r02.equals("s")) {
			 
		 }
		
		return carteira;
	}
	
	public void logar(List<Carteira> banco) {
		Scanner teclado = new Scanner(System.in);
		for (Carteira c : banco) {
			
			System.out.println("Qual é o seu CPF?");
			cpf = teclado.next();
			
			System.out.println("Digite sua senha:");
			senha = teclado.next();
			
			if (c.getSenha().equals(senha)  && c.getCpf().equals(cpf)) {
				//??????????????????
			}
		}
	}

	public void consultarSaldo(List<Carteira> banco) {
		Scanner teclado = new Scanner(System.in);
		
		for (Carteira c : banco) {
			System.out.println("Digite sua senha:");
			senha = teclado.next();

			System.out.println("Qual é o seu CPF?");
			cpf = teclado.next();

			if (c.getSenha().equals(senha)  && c.getCpf().equals(cpf)) {
				System.out.println(
						banco.indexOf(c) + " -> Nome = " + c.getNome() + ", \n saldo = R$ " + c.getSaldo());
			}
		}
	}

	public void depositar(List<Carteira> banco) {
		for (Carteira c : banco) {
			Scanner teclado = new Scanner(System.in);

			double saldo2;
			double somaSaldo;

			System.out.println("Digite sua senha:");
			senha = teclado.next();

			System.out.println("Qual é o seu CPF?");
			cpf = teclado.next();

			if (c.getSenha().equals(senha) && c.getCpf().equals(cpf)) {
				System.out.println(
						banco.indexOf(c) + " -> Nome = " + c.getNome() + " \n saldo = R$ " + c.getSaldo());
				System.out.println("Valor do deposito: ");
				saldo2 = teclado.nextDouble();

				somaSaldo = (saldo2 + c.getSaldo());
				System.out.println("-> Saldo atual: R$ " + somaSaldo);

				c.setSaldo(somaSaldo);

			}
		}
	}

	public void sacar(List<Carteira> banco) {
		for (Carteira c : banco) {
			double valor;
			Scanner teclado = new Scanner(System.in);

			System.out.println("Digite sua senha:");
			senha = teclado.next();

			System.out.println("Qual é o seu CPF?");
			cpf = teclado.next();
			
			if (c.getSenha().equals(senha) && c.getCpf().equals(cpf)) {

				System.out.println(
						banco.indexOf(c) + " Nome = " + c.getNome() + ", \n saldo = R$ " + c.getSaldo());
				System.out.println("Valor do saque: ");
				valor = teclado.nextDouble();
				if (valor > c.getSaldo()) {
					System.out.println("Saldo insuficiente para saque!");

				} else {
					double subSaldo;
					subSaldo = (c.getSaldo() - valor);
					System.out.println("-> Saldo atual: R$ " + subSaldo);

					c.setSaldo(subSaldo);

				}
			}
		}
	}
}
