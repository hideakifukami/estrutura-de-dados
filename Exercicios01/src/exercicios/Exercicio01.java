package exercicios;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 0; i < 3; i++) {
			soma += Integer.parseInt(JOptionPane.showInputDialog("Informe a " + (i+1) + "ª parcela da soma: "));
		}
		
		JOptionPane.showMessageDialog(null, "O valor total da soma é: " + soma);
	}
}
