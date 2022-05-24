package calculos;

public class Calculadora {
	private double valor1;
	private double valor2;
	
	public double getValor1() {
		return valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	
	public double getValor2() {
		return valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public double somar(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;
		
		return valor1 + valor2;
	}
	
	public double subtrair(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;
		
		return valor1 - valor2;
	}
	
	public double multiplicar(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;
		
		return valor1 * valor2;
	}
	
	public double dividir(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;
		
		return valor1 / valor2;
	}
}
