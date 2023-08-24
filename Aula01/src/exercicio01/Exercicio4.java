package exercicio01;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int op;
		int total = 0;
		
		
		
		do {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser somado: "));
			total+=op;
			
			JOptionPane.showMessageDialog(null, "Total da soma: " + total);
			
			
		} while (op!=0);
	}
}
