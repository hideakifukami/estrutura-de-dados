package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class Exercicio06 {
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dataAtual = LocalDate.now();
		
		String dataInput = JOptionPane.showInputDialog("Digite a data de nascimento no formato DD/MM/AAAA");
				
		LocalDate dataNasc = LocalDate.parse(dataInput, format);
		
		long diferenca = ChronoUnit.DAYS.between(dataNasc, dataAtual);
		
		JOptionPane.showMessageDialog(null, "A diferença em dias é: " + diferenca + " dias.");		
		
	}
}
