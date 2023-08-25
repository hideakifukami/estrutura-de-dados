package exercicios;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		String mes = JOptionPane.showInputDialog("Informe o número do mês:");
		String nomeMes;
		
		switch (mes) {
		case "1": {
			nomeMes = "JANEIRO";
			break;
		}

		case "2": {
			nomeMes = "FEVEREIRO";
			break;
		}

		case "3": {
			nomeMes = "MARÇO";
			break;
		}

		case "4": {
			nomeMes = "ABRIL";
			break;
		}

		case "5": {
			nomeMes = "MAIO";
			break;
		}

		case "6": {
			nomeMes = "JUNHO";
			break;
		}

		case "7": {
			nomeMes = "JULHO";
			break;
		}

		case "8": {
			nomeMes = "AGOSTO";
			break;
		}

		case "9": {
			nomeMes = "SETEMBRO";
			break;
		}

		case "10": {
			nomeMes = "OUTUBRO";
			break;
		}

		case "11": {
			nomeMes = "NOVEMBRO";
			break;
		}

		case "12": {
			nomeMes = "DEZEMBRO";
			break;
		}
		
		default:
			JOptionPane.showMessageDialog(null, "MÊS INVÁLIDO: " + mes);
			throw new IllegalArgumentException("MÊS INVÁLIDO: " + mes);
		}
		
		JOptionPane.showMessageDialog(null, nomeMes);
	}
}
