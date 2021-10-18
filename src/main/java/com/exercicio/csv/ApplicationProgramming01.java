package com.exercicio.csv;

import java.util.List;

public class ApplicationProgramming01 {
	public static void main(String[] args) {
		
		List<TamplateCSV> t = new TamplateService().listAll();
		
		System.out.println("Tamanho do Array " + t.size());
		System.out.println("Array na posição [0] " + t.get(0));
		
		t.stream()
		.forEach(n -> System.out.println(n));
		
		}

}
