package fila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaPrioridade filaDePrioridade = new FilaPrioridade();

		filaDePrioridade.enfileirar(new ItemPrioritario(1, "Item 1 (P1)"));
		filaDePrioridade.enfileirar(new ItemPrioritario(2, "Item 2 (P2)"));
		filaDePrioridade.enfileirar(new ItemPrioritario(1, "Item 3 (P1)"));
		filaDePrioridade.enfileirar(new ItemPrioritario(2, "Item 4 (P2)"));
		filaDePrioridade.enfileirar(new ItemPrioritario(2, "Item 5 (P2)"));
		filaDePrioridade.enfileirar(new ItemPrioritario(1, "Item 6 (P1)"));
	
		while (!filaDePrioridade.isEmpty()) {
            System.out.println(filaDePrioridade.desenfileirar());
        }
		
	}
	

	public static void amigoDono(Fila f, Object info) {
		No no = new No(info);
		no.setProx(f.inicio);
		f.inicio = no;
		f.tamanho++;
	}
	
	public static Fila amigoDonoF(Fila f, Object info) {
		No no = new No(info);
		Fila filaAux = new Fila();
		filaAux.enfileirar(no);
		while(!f.isEmpty()) {
			filaAux.enfileirar(f.desenfileirar());
		}
		
		return filaAux;

	}

}
