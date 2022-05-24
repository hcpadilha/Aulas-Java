import java.util.ArrayList;
import java.util.List;

/*
 * Demonstração do uso de ArrayList
 */
public class App {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Matheus");
		lista.add("João");
		lista.add("Beatriz");
		lista.add("Vinicius");
		
		for(String temp: lista) {
			System.out.println(temp);
		}
		
		// Procurando a Beatriz
		System.out.println("O Array tem " + lista.size() + " elementos.");
		
		System.out.println(lista.contains("Beatriz"));
		System.out.println("O valor está no índice " + lista.indexOf("Beatriz"));
		System.out.println("O conteúdo do índice 3 é " + lista.get(3));
	}

}
