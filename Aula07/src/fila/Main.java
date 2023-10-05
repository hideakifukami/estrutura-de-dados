package fila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila fila = new Fila();
		
		System.out.println(fila.isEmpty());
		System.out.println(fila.desenfileirar());
		fila.enfileirar("Primeiro Elemento");
		System.out.println(fila.returnInicio());
		System.out.println(fila.returnFim());
		fila.enfileirar("Segundo Elemento");
		System.out.println(fila.returnInicio());
		System.out.println(fila.returnFim());
		System.out.println(fila.isEmpty());
		amigoDono(fila, "AMIGO DO DONO");
		System.out.println(fila.returnInicio());
		System.out.println(fila.returnFim());
		System.out.println(fila.desenfileirar());
		System.out.println(fila.returnInicio());
		System.out.println(fila.returnFim());
		System.out.println(fila.desenfileirar());
		System.out.println(fila.returnInicio());
		System.out.println(fila.returnFim());
	
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
