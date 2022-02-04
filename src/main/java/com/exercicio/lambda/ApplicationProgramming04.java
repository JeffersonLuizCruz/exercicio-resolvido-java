package com.exercicio.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationProgramming04 {
	public static void main(String[] args) {
		
		List<String> listaDeNome = Arrays.asList("Hugo", "Jeff", "Luiz", "Cruz");
		List<String> result = listaDeNome.stream().filter(obj -> 
									obj.startsWith("J"))
									.collect(Collectors.toList());
		System.out.println(result);
		System.out.println("----");
		System.out.println(listaDeNome);
	}
}
