package fila;

public class FilaPrioridade extends Fila {
    public FilaPrioridade() {
        super();
    }

    public void enfileirar(ItemPrioritario item) {
        if (item.getPrioridade() < 1 || item.getPrioridade() > 2) {
            System.out.println("Prioridade inválida. Deve ser 1 ou 2.");
            return;
        }

        No no = new No(item.getInfo());

        if (isEmpty()) {
            inicio = no;
            fim = no;
        } else {
            No atual = inicio;
            No anterior = null;

            // Encontrar o local correto para inserir com base na prioridade
            while (atual != null && item.getPrioridade() >= obterPrioridade(atual.getInfo())) {
                anterior = atual;
                atual = atual.getProx();
            }

            // Inserir o novo nó na posição correta
            if (anterior == null) {
                no.setProx(inicio);
                inicio = no;
            } else {
                no.setProx(atual);
                anterior.setProx(no);
                if (atual == null) {
                    fim = no;
                }
            }
        }

        tamanho++;
    }

    private int obterPrioridade(Object info) {
        if (info instanceof ItemPrioritario) {
            return ((ItemPrioritario) info).getPrioridade();
        }
        return 2; // Se a prioridade não puder ser determinada, usamos a prioridade mais baixa (2).
    }
}
