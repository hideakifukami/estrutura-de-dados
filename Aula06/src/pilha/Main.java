package pilha;

public class Main {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Pilha pilhaInvertida = new Pilha();
		
		System.out.println(pilha.isEmpty());

		pilha.push("Primeiro Item");
		
		System.out.println(pilha.returnTop());
		
		System.out.println(pilha.isEmpty());
		
		pilha.push("Segundo Item");
		
		System.out.println(pilha.returnTop());

		pilha.pull();
		
		System.out.println(pilha.returnTop());
		
		pilha.pull();
		
		System.out.println(pilha.returnTop());
		
		System.out.println(pilha.isEmpty());
		
		pilha.push("Clovis");
		pilha.push("Lehy");
		pilha.push("Ronalda");
		pilha.push("Hideaki");
		
		System.out.println(pilha.getTamanho());
		
		imprimirPilha(pilha);
		inverterPilha(pilha);
		imprimirPilha(pilha);
		
	}

	private static void inverterPilha(Pilha pilha) {
		while(!pilha.isEmpty()) {
			pilhaInvertida.push(pilha.pull());
		}
		
	}

	private static void imprimirPilha(Pilha pilha) {
		while(!pilha.isEmpty()) {
			System.out.println(pilha.pull());
		}		
	}
}
