package erros;

public class Frase {

	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		Frase f = new Frase();
		
		try {
			novaFrase = f.converterFrase(frase);
		} catch (Exception e) {
			System.out.println("Erro genérico");
			e.printStackTrace();
		} 
		
		System.out.println("Frase Antiga : " + frase);
		System.out.println("Frase Nova   : " + novaFrase);
	}

	public String converterFrase(String frase) throws NullPointerException, Exception {
		String novaFrase = null;
		String fr = null;

		novaFrase = fr.toUpperCase();

		return novaFrase;
	}
}
