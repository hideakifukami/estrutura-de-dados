package exercicios;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mult(6,4));
	}
	
	public static double mult(double v1, double v2) {
		if(v1 == 1) return v2;
		return v2 + mult(v1-1, v2);
	}

}
