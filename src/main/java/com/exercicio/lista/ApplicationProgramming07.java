package com.exercicio.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationProgramming07 {
	public static void main(String[] args) {
		
		List<List<String>> listbidimensional = new ArrayList<>();
		List<String> arrayLinha = Arrays.asList("Hugo", "Jefferson", "Jeff", "Luiz");
		List<String> arrayColumn = Arrays.asList("Nome01", "Nome02", "Nome03", "Nome04");
		
		List<String> linha = new ArrayList<>();
		List<String> coluna = new ArrayList<>();
		
		for(int i = 0; i < arrayLinha.size(); i++) {
			linha.add(arrayLinha.get(i));
			coluna.add(arrayColumn.get(i));
		}
		
		listbidimensional.add(coluna);
		listbidimensional.add(linha);
		
		for(int i = 0; i < arrayLinha.size(); i++) {
			for(int j = 0; j < arrayColumn.size(); j++) {
				try {
					 System.out.printf("%s", listbidimensional.get(i).get(j) + " ");
				} catch (IndexOutOfBoundsException e) {
					
				}
				
			}
			System.out.println("");
		}		
		
	}
	

}
