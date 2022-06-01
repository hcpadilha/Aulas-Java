package correcaoCaptcha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppCaptcha {

	public static void main(String[] args) {
		String entrada;
		String captcha = "B33A3D";
		boolean continua = true;
		Scanner teclado = new Scanner(System.in);
		AppCaptcha app = new AppCaptcha();	
		
		
		do {
			captcha = app.gerarCaptcha();
			
		System.out.println("---------");
		System.out.println(captcha);
		System.out.println("---------");
		System.out.println("Digite o código acima: ");
		entrada = teclado.next();
		
		if(captcha.equals(entrada)) {
			System.out.println("Parabéns! Você não é um robô!");
			continua = false;
		} else {
			System.out.println("Robôs não são permitidos");
		}
	}while(continua);
		
		teclado.close();
	}
	
	public String gerarCaptcha() {
		String captcha = "";
		int valor;
		Random sorteio = new Random();
		
		String urna = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
	
		
		for(int i = 0; i < 6; i++) {
			valor = sorteio.nextInt(urna.length()); //length é um atributo para contar os indicies de uma string.
			captcha += urna.substring(valor, valor+1); //adicionar os valores atribuidos no indicie da string 
		}
		return captcha;
	}

}
