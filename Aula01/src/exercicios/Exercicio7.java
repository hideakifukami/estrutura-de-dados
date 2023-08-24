package exercicios;

public class Exercicio7 {

	public static void main(String[] args) {
		String[] alunos = {"Ricardo", "Claudio", "Carlos Eduardo"};
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].equalsIgnoreCase("Carlos Eduardo")) {
				System.out.println("Cliente encontrado!");
				break;
			} 
		}
	}
}
