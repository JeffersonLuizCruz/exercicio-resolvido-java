package com.exercicio.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ApplicationPromming01 {
	public static void main(String[] args) {
		
		// 01 - Sem stream
		String c0 = "Recife";
		String c1 = "Lagoa";
		String c2 = "Cupira";
		String c10 = null;
		String c3 = "Ipojuca";
		String c4 = "Cabo";
		String c5 = "Suepe";

		
		List<String> listCidade = new ArrayList<>(Arrays.asList(c0, c1, c2, c3, c4, c5, c10));
		List<String> filter = new ArrayList<>();
		
		for(String compare : listCidade) {
			if(compare != null) {
			if(compare.equalsIgnoreCase("recife")) {
				filter.add(compare);
			}
		 }
	}
		
		System.out.println(filter);
		
		// 02 - Exemplo de stream
		List<String> filterStreamToList = listCidade.stream()
		.filter(n -> Objects.nonNull(n))
		.filter(n -> n.equalsIgnoreCase("ipojuca"))
		.collect(Collectors.toList());
		
		System.out.println(filterStreamToList);
		
		// 03 Exemplo de stream
		List<String> filterStreamToCollection = listCidade.stream()
		.filter(Objects::nonNull)
		.filter(n -> n.equalsIgnoreCase("Cupira"))
		.collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(filterStreamToCollection);
		

	}

}
