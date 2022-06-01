package amigoCulto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmigoCulto {
	 public static void main(String[] args) {
		Random sorteio = new Random();
		int valores;
		String rSorteio;
		 List<String> nomes = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		
			
		 System.out.println("Quantas pessoas você deseja passear? ");
		 	valores = teclado.nextInt();
		 
		 	for(int i = 0; i < valores; i++ ) {
				System.out.println("Digite o nome: ");
				
				nomes.add(teclado.next());
				
			}	
		 	
		 	System.out.println("Você deseja sortear? s/n ");
		 	rSorteio = teclado.next();
		 	
		 	if(rSorteio.equals("s")) {
		 		System.out.println("O nome sorteado foi: " + nomes.get(sorteio.nextInt(nomes.size())));
		 
		 	}else if (rSorteio.equals("n")){
		 		System.out.println("Termino do programa!");
		 	}else {
		 		System.out.println("Inválido");
		 	}
		 	
		 
		 teclado.close();
		 
	
			
	}
}
