//import java.util.Random;
import java.util.Scanner;

public class Captcha {

	public static void main(String[] args) {
		
		//Random gerador = new Random();
		String captcha;
		String escolha = "s" ;
		
		Scanner teclado = new Scanner(System.in);
		
		 do {
        
			System.out.println("Código: Casa");

        System.out.println("Digite o captcha corretamente:");
         captcha = teclado.next();
     	
        
         if(captcha.equals("Casa")) {
        	 System.out.println("Acesso Livre");
         }else  {
        	 System.out.println("O código está errado, tente novamente! (s/n)");
        	 escolha = teclado.next();
         }
        
       
	}while(escolha.equals("s"));
		 
		teclado.close();

}}
