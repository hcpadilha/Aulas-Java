import java.util.Scanner;

public class AppScan {

	public static void main(String[] args) {
		int numeroLido;
		String textoLido;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		numeroLido = teclado.nextInt();
		
		System.out.println("Digite um nome:");
		textoLido = teclado.next();
		
		
		System.out.println("O valor digitado foi : " + numeroLido);
		System.out.println("Seu nome é " + textoLido);
	}

}
