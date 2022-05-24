
class Hobbits {
	String nome;

	public static void main(String[] args) {
		Hobbits[] h = new Hobbits[3];

		int z = 0;

		while (z < 3) {
			h[z] = new Hobbits();
			h[z].nome = "bilbo";

			if (z == 1) {
				h[z].nome = "frodo";
			}

			if (z == 2) {
				h[z].nome = "sam";
			}

			System.out.println(h[z].nome + " é um ");
			System.out.println(" bom nome parar um hobbit");
			
			z=z+1;			
		}
	}
}