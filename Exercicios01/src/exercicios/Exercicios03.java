package exercicios;

public class Exercicios03 {
	public static void main(String[] args) {
		for(int i =  11; i <= 99; i++) {
			if(i % 10 == 0) {
				System.out.print(i + " | \n");
			} else {
				System.out.print(i + " | ");
			}
		}
	}
}
