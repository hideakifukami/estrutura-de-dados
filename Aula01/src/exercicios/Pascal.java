package exercicios;

import java.util.Scanner;

public class Pascal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i, j;
		
		do {
			System.out.println("Informe um número: ");
			num = sc.nextInt();
			
			for(i = 1; i <= num; i++) {
				System.out.println("");
				for(j = 1; j <= i; j++) {
					System.out.print(i);
				}
				
			}
			
			System.out.println("\n");
			
		} while (num!=0);
		
		
	}
}
