package exercicios;

public class Tabela {

	public static void main(String[] args) {
		int i, j;
		
		for(i = 1; i <= 10; i++) {
			for(j = 1; j <= 10; j++) {
				System.out.printf(j*i + "|");
			}
			System.out.println("");
		}
	}
}
