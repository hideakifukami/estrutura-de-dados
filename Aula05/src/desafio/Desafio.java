package desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Desafio {

	final static String ARQ_IN = "resources\\desafio-entrada.txt";
	static FileReader fr;
	static BufferedReader br;

	final static String ARQ_OUT = "resources\\desafio-saida.txt";
	static FileWriter fw;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		fr = new FileReader(ARQ_IN);
		br = new BufferedReader(fr);
		fw = new FileWriter(ARQ_OUT);
		bw = new BufferedWriter(fw);
		
		String[] nums;
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		
		
	}
}
