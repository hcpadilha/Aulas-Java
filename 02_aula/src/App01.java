
public class App01 {

	public static void main(String[] args) {
		int n = 0;
		int max = 10;
		String virgula = ",";
		
		while(n <= max) {
			
			if(n == max) {
				virgula = "";
			}
			
			System.out.print(n + virgula);
			n++;
		}
	}

}
