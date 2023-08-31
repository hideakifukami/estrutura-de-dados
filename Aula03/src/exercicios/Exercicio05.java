package exercicios;

public class Exercicio05 {
	static double[] list = {1, 2, 3, 4, 5, 6, 9};
	static int tam = list.length;
	
	public static void main(String[] args) {
		System.out.println(sum(list));
		
	}
	
	public static double sum(double[] list) {
		if(tam == 1) return list[0];
		tam--;
		return list[tam] + sum(list);
	}
}
