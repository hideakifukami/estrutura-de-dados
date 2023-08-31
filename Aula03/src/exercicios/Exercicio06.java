package exercicios;

public class Exercicio06 {
	public static void main(String[] args) {
		int[] v = {5, 7, 6, 8, 9, 1, 15};
		misterio(v, 0, v.length - 1);
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
	}
	
	public static void misterio(int v[], int esq, int dir) {
		int t;
		if(esq >= dir) return;
		t = v[esq];
		v[esq] = v[dir];
		v[dir] = t;
		misterio(v, esq+1, dir-1);
	}
}
