package com.exercicio;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ApplicationProgrammingTest {
	public static void main(String[] args) throws IOException {
		
		List<String> listaNomes = Arrays.asList("Hugo", "Jefferson", "Luiz", "Cruz");
		
		listaNomes.set(1, "Jeff");
		
		System.out.println("Resultado da Lista: " + listaNomes.toString());

	}
}
