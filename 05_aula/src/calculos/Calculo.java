package calculos;

public class Calculo {

	public static void main(String[] args) {
		double calculo = 0;
		
		Calculadora calculadora = new Calculadora(5,5);
		
		System.out.println(calculadora.somar());
		System.out.println(calculadora.subtrair(6,7));
		
		
		/*
		System.out.println("Multiplica��o " + calculadora.multiplicar(40,4));
		System.out.println("Soma " + calculadora.somar(5,6));
		
		calculo = calculadora.dividir(6,0);
		
		if(calculo == 0) {
			System.out.println("N�o � permitido usar 0 na divis�o!");
		} else {
			System.out.println("Dividir " + calculo);
		}
		*/
	}

}
