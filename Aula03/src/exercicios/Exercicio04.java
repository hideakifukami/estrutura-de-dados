package exercicios;

public class Exercicio04 {

	public static void main(String[] args) {
		System.out.println(fat(5));
	}
	
	public static double fat(double num) {
		if(num == 1) return num;		
		return num * fat(num - 1);
		
	}
	
}
