package fila;

public class Main {

	public static void main(String[] args) {
		FilaPrioridade filaDePrioridade = new FilaPrioridade();

		filaDePrioridade.enfileirar(new ItemPrioritario("Ana", 1));
		filaDePrioridade.enfileirar(new ItemPrioritario("João", 1));
		filaDePrioridade.enfileirar(new ItemPrioritario("Marcos", 2));
		filaDePrioridade.enfileirar(new ItemPrioritario("Maria", 1));
	
		while (!filaDePrioridade.isEmpty()) {
            System.out.println(filaDePrioridade.desenfileirar());
        }
		
	}
	
}
