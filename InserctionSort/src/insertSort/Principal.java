package insertSort;

public class Principal {
	private static int valores[] = {1,5,6,2,3,7,3,5,9};

	public static void main(String[] args) {
		// inserctionSort(valores);
		//bubbleSort(valores);
		//bubbleSortRec(valores);
		bubbleSortN(valores);
		
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
			for (j = 0; j < valores.length - 1; j++) {
				if (valores[j+1] < valores[j]) {
					aux = valores[j+1];
					valores[j+1] = valores[j];
					valores[j] = aux;
				}
			}
		}
	}
	
	private static void bubbleSortRec(int[] valores) {
		int aux;
		boolean x = false;
		for (int i = 0; i < valores.length - 1; i++) {			
			if (valores[i+1] < valores[i]) {
				aux = valores[i+1];
				valores[i+1] = valores[i];
				valores[i] = aux;
				x = true;
			}			
		}
		
		if (x) {
			bubbleSortRec(valores);
		}
	
	}
	
	private static void bubbleSortN(int[] valores) {
		int aux, i;
		boolean x;
		do {
			x = false;
			for (i = 0; i < valores.length - 1; i++) {			
				if (valores[i+1] < valores[i]) {
					aux = valores[i+1];
					valores[i+1] = valores[i];
					valores[i] = aux;
					x = true;
				}			
			}
		} while (x);
	}
}
