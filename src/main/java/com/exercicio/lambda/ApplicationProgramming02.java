package com.exercicio.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ApplicationProgramming02 {
	public static void main(String[] args) {
		String nome = "SILVA";
		String arquivo = "nomes.txt";
		Integer count= 0;
		Integer soma = 0;
		
		/*Java 7*/
		try(BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			
			String result;
			while((result = br.readLine()) != null) {
				if(result.contains(nome)) {
					count++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.printf("01- Exemplo: O nome '%s' ocorre '%d' vezes.\n", nome, count);
		
		
		/*Java 8*/
		try {
			List<String> linhas = Files.readAllLines(Path.of(arquivo));
			for(String linha : linhas) {
				if(linha.contains(nome)) {
					soma++;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("02- Exemplo: O nome '%s' ocorre '%d' vezes.\n", nome, count);
		
		/*Java 8 com Lambda*/
		
		try {
			long countResult = Files.lines(Path.of(arquivo)).filter(linha -> linha.contains(nome)).count();
			System.out.printf("03- Exemplo: O nome '%s' ocorre '%d' vezes.\n", nome, countResult);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
