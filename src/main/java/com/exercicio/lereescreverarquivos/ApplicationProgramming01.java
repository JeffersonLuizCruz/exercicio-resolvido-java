package com.exercicio.lereescreverarquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Exenplo de leitura de arquivos usando InputStream E Reader
 * */
public class ApplicationProgramming01 {
	public static void main(String[] args) throws IOException {
		// Também é possível usar a entrada de dados usando o inputStream e Reader. Elas são classes abstratadas e extentidas por FileInputStream e InputStreamReader
//		InputStream file = new FileInputStream("tamplate.csv");
//		Reader isr = new InputStreamReader(file); // transforma byts em caracteres
		
		
		FileInputStream file = new FileInputStream("tamplate.csv");
		InputStreamReader isr = new InputStreamReader(file, "UTF-8"); // transforma byts em caracteres
		BufferedReader br = new BufferedReader(isr); // ler os caracteres e manipula	
		
		String readLine = br.readLine();
		
		while(readLine != null) {
			System.out.println(readLine);
			readLine = br.readLine();
		}
		br.close();
	}

}
