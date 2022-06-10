package animais;

public class Cachorro extends Animal implements Pet{

	@Override
	public String brincar() {
		return "correr atrás da bola";
	}

}
