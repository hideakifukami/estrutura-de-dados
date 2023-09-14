package aula05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	final static String ARQ_IN = "resources\\musica.txt";
	static FileReader fr;
	static BufferedReader br;
	static Scanner sc = new Scanner(System.in);

	final static String ARQ_OUT = "resources\\saida.txt";
	static FileWriter fw;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		fr = new FileReader(ARQ_IN);
		br = new BufferedReader(fr);
		fw = new FileWriter(ARQ_OUT);
		bw = new BufferedWriter(fw);
		
		leitura();
		escrita();
		ex1DataSubstring();
		ex2DataSplit();
		ex3NameSplit();
		ex4Trim();
		
	}

	private static void ex4Trim() {
		String resposta = "reginaldo rossi";
		System.out.println("Quem descobriu o Brasil?");
		String respostaUser = sc.nextLine();
		
		if (respostaUser.trim().toLowerCase().equals(resposta)) {
			System.out.println("Parabéns!");
		} else {
			System.out.println("Cê vai morê hein!");
		}
		
	}

	private static void ex3NameSplit() {
		System.out.println("Informe nome e sobrenome: ");
		String nomeCompleto = sc.nextLine();
		String[] nomeCompletoList = nomeCompleto.split(" ");
		int pos = nomeCompletoList.length - 1;
		System.out.println(nomeCompletoList[pos]);
		
	}

	private static void ex2DataSplit() {
		String data = "2022/10/28";
		String[] datas = data.split("/");
		String dataFormat = datas[2] + "/" + datas[1] + "/" + datas[0];
		System.out.println(dataFormat);
	}

	private static void ex1DataSubstring() {
		String data = "2022/10/28";
		String ano = data.substring(0, 4);
		String mes = data.substring(5, 7);
		String dia = data.substring(8);
		String dataFormat = dia + "/" + mes + "/" + ano;
		System.out.println(dataFormat);		
	}

	private static void escrita() throws IOException {
		bw.append("Primeira linha");
		bw.newLine();
		bw.append("Segunda linha \n");
		bw.append("Terceira linha \n");
		bw.flush();
	}

	private static void leitura() throws IOException {
		String linha = br.readLine();
		
		while(linha!=null) {
			System.out.println(linha);
			linha = br.readLine();
		}
	}

}
