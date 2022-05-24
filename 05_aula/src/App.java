import java.util.ArrayList;
import java.util.List;

/*
 * Demonstra��o do uso de ArrayList
 */
public class App {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Matheus");
		lista.add("Jo�o");
		lista.add("Beatriz");
		lista.add("Vinicius");
		
		for(String temp: lista) {
			System.out.println(temp);
		}
		
		// Procurando a Beatriz
		System.out.println("O Array tem " + lista.size() + " elementos.");
		
		System.out.println(lista.contains("Beatriz"));
		System.out.println("O valor est� no �ndice " + lista.indexOf("Beatriz"));
		System.out.println("O conte�do do �ndice 3 � " + lista.get(3));
	}

}
