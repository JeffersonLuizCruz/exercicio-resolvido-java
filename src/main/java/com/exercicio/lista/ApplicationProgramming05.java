package com.exercicio.lista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationProgramming05 {
	public static void main(String[] args) {
		
		String cidade = "São Paulo, Recife, Rio de Janeiro, Campinas, Paraíba, Alagoas";
		String[] splitCidade = cidade.split(",");
		
		String nome = "Jefferson, Hugo, Luiz, Carol, Jeff, Ana";
		String[] splitNome = nome.split(",");
		
		Map<String, List<String>> map = new HashMap<>();
		List<String> listCidades = new ArrayList<>();
		
		for(String valueCidade : splitCidade) {
			listCidades.add(valueCidade);
			for(String valueNome : splitNome) {
				map.put(valueNome, listCidades);
			}
		}
		
		System.out.println(map.entrySet());
	}

}
