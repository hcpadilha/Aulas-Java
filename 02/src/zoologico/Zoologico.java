package zoologico;

public class Zoologico {

	public static void main(String[] args) {
		Pelicano p1, p2;
		
		p1 = new Pelicano();
		p2 = new Pelicano();
		
		p1.setCor("branco");
		p1.peso = 30;
		p2.setCor("preta");
		p2.peso = 30;
		
		p1.voar();
		p2.comer();
		p1.definirNome("Arian");
		
		System.out.println("o pelicano p1 é " + p1.getCor());
		System.out.println("o pelicano p2 é " + p2.getCor());
		System.out.println("outra forma de retornar a cor " + p2.retornarCor());
		
	}
	

}
