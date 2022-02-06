package com.exercicio.lista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationProgramming09 {

	public static void main(String[] args) {
		
		List<String> result = Arrays.asList("hugo", "Jeff", "Luiz");
		List<String> lista = result.stream().filter(obj -> obj != null).collect(Collectors.toList());
		lista.remove(0);
		System.out.println(lista);

	}

}
