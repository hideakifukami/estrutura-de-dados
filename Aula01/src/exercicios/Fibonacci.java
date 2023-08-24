package exercicios;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos, i;
		int aux1 = 0, aux2 = 0;
		int fib = 1;
		
		
		do {
			System.out.println("Informe a posição máxima de Fibonacci: ");
			pos = sc.nextInt();
			
			for(i = 1; i <= pos; i++) {
				System.out.print(fib + " | ");
				aux2 = aux1;
				aux1 = fib;
				fib += aux2;
			}
			
		} while (pos!=0);
	}
	
}
