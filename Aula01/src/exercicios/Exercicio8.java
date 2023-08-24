package exercicios;

public class Exercicio8 {

	public static void main(String[] args) {
		String[] alunos = {"Ricardo", "Claudio", "Carlos Eduardo"};
		boolean encontrou = false;
		
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].equalsIgnoreCase("Carlos Eduardo")) {
				System.out.println("Cliente encontrado!");
				encontrou = true;
				break;
			} 
		}
		
		if(!encontrou) {
			System.out.println("Não encontrou.");
		}
	}
}
