package insertSort;

public class Principal {
	private static int valores[] = {1,5,6,2,3,7,3,5,9};

	public static void main(String[] args) {
		// inserctionSort(valores);
		bubbleSortRec(valores);

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
	
	private static void bubbleSort(int[] valores) {
		int aux,j;
		for (int i = 0; i < valores.length; i++) {			
			for (j = 1; j < valores.length; j++) {
				if (valores[j-1] > valores[j]) {
					aux = valores[j];
					valores[j] = valores[j-1];
					valores[j-1] = aux;
				}
			}
		}
	}
	
	private static void bubbleSortRec(int[] valores) {
		int aux,j;
		boolean x = false;
		for (int i = 1; i < valores.length; i++) {			
			if (valores[i-1] > valores[i]) {
				aux = valores[i];
				valores[i] = valores[i-1];
				valores[i-1] = aux;
				x = true;
			}			
		}
		
		if (x) {
			bubbleSortRec(valores);
			x = false;
		}
	
	}
}
