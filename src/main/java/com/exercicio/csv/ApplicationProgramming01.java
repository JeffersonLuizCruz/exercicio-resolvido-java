package com.exercicio.csv;

import java.util.List;

public class ApplicationProgramming01 {
	public static void main(String[] args) {
		
		List<TamplateCSV> t = new TamplateService().listAll();
		
		System.out.println(t.get(1).getCategoria());
	}

}
