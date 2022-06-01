package correcaoCaptcha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppCaptcha2 {

	public static void main(String[] args) {
		String entrada;
		String captcha = "B33A3D";
		boolean continua = true;
		Scanner teclado = new Scanner(System.in);
		AppCaptcha2 app = new AppCaptcha2();	
		
		
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
		
		List<String> urna = new ArrayList<String>();
		urna.add("A");
		urna.add("B");
		urna.add("C");
		urna.add("D");
		urna.add("E");
		urna.add("F");
		urna.add("G");
		urna.add("H");
		urna.add("I");
		urna.add("J");
		urna.add("K");
		urna.add("L");
		urna.add("M");
		urna.add("N");
		urna.add("O");
		urna.add("P");
		urna.add("Q");
		urna.add("R");
		urna.add("S");
		urna.add("T");
		urna.add("U");
		urna.add("V");
		urna.add("X");
		urna.add("Z");
		urna.add("0");
		urna.add("1");
		urna.add("2");
		urna.add("3");
		urna.add("4");
		urna.add("5");
		urna.add("6");
		urna.add("7");
		urna.add("8");
		urna.add("9");
		
		for(int i = 0; i < 6; i++) {
			valor = sorteio.nextInt(urna.size()); //nessa situação a variavel valor recebe a quantidade de indices do array e que vai ser  sorteada pela variavel sorteio
		captcha += urna.get(valor); //aqui o capcthavai capturar o valor atribuido ao indicie especifico
		}
		return captcha;
	}

}
