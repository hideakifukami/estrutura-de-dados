package exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mult(6,4));
	}
	
	public static double mult(double v1, double v2) {
		double resultado = 0;
		
		for(int i = 0; i < v1; i ++) {
			resultado += v2;
		}
		return resultado;
	}

}
