package zoologico;

import animais.Animal;
import animais.Gato;
import animais.Leao;
import animais.Tatu;

public class App {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Leao leao = new Leao();
		Tatu tatu = new Tatu();
		
		gato.setCor("Branco e Preto");
		gato.setPeso(20);
		gato.setTamanho(5);
		gato.setNome("Brutus");
		
		System.out.println(gato.getNome() + ", " + gato.brincar());
		System.out.println(leao.comer());
		System.out.println(tatu.emitirSom());
		System.out.println(gato.emitirSom());
		
		Animal[] animais = new Animal[3];
		
		animais[0] = new Leao();
		animais[1] = new Tatu();
		animais[2] = new Gato();
		
		for(Animal x: animais) {
			System.out.println(x.emitirSom());
		}
		
		System.out.println(animais[1].emitirSom());
	}

}
