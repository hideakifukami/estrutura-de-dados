package pilha;

public class Pilha {
	private No topo;
	private int tamanho = 0;
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public Object returnTop() {
		if(isEmpty()) {
			return null;
		} else {
			return topo.info;
		}
	}
	
	public void push(Object info) {
		No no = new No(info);
		if(!isEmpty()) {
			no.prox = topo;
		}
		
		topo = no;
		tamanho++;
	}
	
	public Object pull() {
		if(isEmpty()) {
			return null;
		} else {
			Object info = topo.info;
			topo = topo.prox;
			tamanho--;
			return info;
		}

	}

	public int getTamanho() {
		return tamanho;
	}
	
	
	
	
	
}
