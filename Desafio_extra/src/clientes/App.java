package clientes;

import java.util.Scanner;

import controle.Controle;
import modelo.Carteira;
import visao.Menu;
import visao.Menu02;

public class App {
	public static void main(String[] args) {

		int tipoMenu = 1;

		// Carteira carteira = new Carteira();
		Controle controle = new Controle();
		Menu menu = new Menu();
		Menu02 menu02 = new Menu02();

		Scanner teclado = new Scanner(System.in);

		int resposta = 99;
		do {
			if (tipoMenu == 1) {
				menu02.desenharMenu02();
				resposta = teclado.nextInt();
				tipoMenu = 2;

			} else if (tipoMenu == 2) {
				menu.desenharMenu();
				resposta = teclado.nextInt();
			}

			controle.avaliarOpcao(resposta);

		} while (resposta < 6);
		System.out.println("Fim do programa!");
		teclado.close();
	}
}
