package insertSort;

public class Principal {
	private static int valores[] = {1,5,6,2,3,7,3,5,9};

	public static void main(String[] args) {
		inserctionSort(valores);

		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i]);
		}
	}

	private static void inserctionSort(int[] valores) {
		for (int i = 0; i < valores.length; i++) {
			int menor = Integer.MAX_VALUE;
			int indiceMenor = -1;
			for (int j = i; j < valores.length; j++) {
				if (valores[j] < menor) {
					menor = valores[j];
					indiceMenor = j;
				}				
			}
			valores[indiceMenor] = valores[i];
			valores[i] = menor;
		}
	}
}
