package clientes;

import java.util.Scanner;

import controle.Controle;

import visao.Menu;

public class App {

	public static void main(String[] args) {
		int resposta;

		Scanner teclado = new Scanner(System.in);
		Menu menu = new Menu();
		Controle controle = new Controle();
		do {
			menu.desenharMenu();
			resposta = teclado.nextInt();
			controle.avaliarOpcao(resposta);
		} while (resposta < 8);
		System.out.println("Fim do programa!");

		teclado.close();
	}

}
