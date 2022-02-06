package com.exercicio.lerarquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationProgramming01 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("tamplate.csv");
		InputStreamReader isr = new InputStreamReader(file); // transforma byts em caracteres
		BufferedReader br = new BufferedReader(isr); // ler os caracteres e manipula
		
		System.out.println(br.readLine());
		br.close();
	}

}
