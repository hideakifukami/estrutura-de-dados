package fila;

public class FilaPrioridade extends Fila {
    private Fila filaPrioridade1;
    private Fila filaPrioridade2;

    public FilaPrioridade() {
        super();
        filaPrioridade1 = new Fila();
        filaPrioridade2 = new Fila();
    }

    public void enfileirar(ItemPrioritario item) {
        if (item.getPrioridade() < 1 || item.getPrioridade() > 2) {
            System.out.println("Prioridade inválida. Deve ser 1 ou 2.");
            return;
        }

        if (item.getPrioridade() == 1) {
            filaPrioridade1.enfileirar(item.getInfo());
        } else if (item.getPrioridade() == 2) {
            filaPrioridade2.enfileirar(item.getInfo());
        }
    }

    public Object desenfileirar() {
        if (!filaPrioridade2.isEmpty()) {
            return filaPrioridade2.desenfileirar();
        } else if (!filaPrioridade1.isEmpty()) {
            return filaPrioridade1.desenfileirar();
        } else {
            return null;
        }
    }
    
    @Override
    public boolean isEmpty() {
		if (filaPrioridade1.tamanho == 0 && filaPrioridade2.tamanho == 0) {
			return true;
		} else {
			return false;
		}
    	
	}
}
