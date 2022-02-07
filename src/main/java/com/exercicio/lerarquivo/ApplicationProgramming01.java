package com.exercicio.lerarquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ApplicationProgramming01 {
	public static void main(String[] args) throws IOException {
		
		InputStream file = new FileInputStream("tamplate.csv");
		Reader isr = new InputStreamReader(file); // transforma byts em caracteres
		BufferedReader br = new BufferedReader(isr); // ler os caracteres e manipula
		
		String readLine = br.readLine();
		
		while(readLine != null) {
			System.out.println(readLine);
			readLine = br.readLine();
		}
		br.close();
	}

}
