package fila;

public class Fila {
	int tamanho = 0;
	No inicio;
	No fim;
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public Object returnInicio() {
		if(isEmpty()) {
			return null;
		}
		
		return inicio.getInfo();
	}
	
	public Object returnFim() {
		if(isEmpty()) {
			return null;
		}
		
		return fim.getInfo();
	}
	
	public void enfileirar(Object info) {
		No no = new No(info);
		if(!isEmpty()) {
			fim.setProx(no);
		} else {
			inicio = no;
		}
		
		fim = no;
		tamanho++;
	}
	
	public Object desenfileirar() {
		if(isEmpty()) {
			return null;
		}
		Object info = inicio.getInfo();
		inicio = inicio.getProx();
		tamanho--;
		
		return info;		
	}
	
	
}
