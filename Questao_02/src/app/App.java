package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int noite;
		double conta = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("---HOTEL S�O PATR�CIO---");
		System.out.println("Numero de Noites Desejadas?");
		noite = teclado.nextInt();

		for (int i = 1; i <= noite; i++) {
			conta += (100 / i);
		}

		System.out.print("O custo ser� de: R$" + conta);

	}
}
