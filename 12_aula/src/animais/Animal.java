package animais;

public abstract class Animal {
	private int tamanho;
	private String cor;
	private double peso;
	private String nome;
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String comer() {
		return "comendo...";
	}
	
	public String dormir() {
		return "dormindo...";
	}
	
	public String emitirSom() {
		return "miau!";
	}
	
}
