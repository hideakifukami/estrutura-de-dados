package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
				
		System.out.println("Informe o número a calcular seu fatorial: ");
		int numero = sc.nextInt();
		long fat = 1;
		
		while (numero > 0) {
			
			fat*=numero;
			numero--;
		}
		
		System.out.println("Resultado do fatorial: " + fat);
	}

}
