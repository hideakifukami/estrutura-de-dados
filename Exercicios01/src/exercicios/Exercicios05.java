package exercicios;

public class Exercicios05 {
	public static void main(String[] args) {
		
		int i, j;

		for(i = 1; i < 10; i+=2) {
			for(j = 1; j <= i; j++) {
				if(j == i) {
					System.out.print("* \n");
				} else {
					System.out.print("*");
				}
				
			}
		}
	}
}
