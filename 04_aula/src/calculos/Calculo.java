package calculos;

public class Calculo {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Multiplicação " + calculadora.multiplicar(40,4));
		System.out.println("Soma " + calculadora.somar(5,6));
		System.out.println("Dividir " + calculadora.dividir(6,3));
	}

}
