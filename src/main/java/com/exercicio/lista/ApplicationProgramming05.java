package com.exercicio.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Essa atividade é para entender como funciona Map<String, List<String>>
 * O objetivo dessa atividade é ver se um determinado valor existe dentro do map.
 * */
public class ApplicationProgramming05 {
	public static void main(String[] args) {
		
		String cidade = "São Paulo, Recife, Rio de Janeiro, Campinas, Paraíba, Alagoas";
		String[] splitCidade = cidade.split(",");
		
		String nome1 = "Jefferson, Hugo, Luiz, Carol, Jeff, Ana";
//		String nome2 = "Fulano, Ciclano, Beutrano, Tadeu, Jubelina, Serafina";
//		String nome3 = "Matiude, Froide, Brumenaudo, Tiringa, Fabula, Cassiude";
		
		String[] splitNome1 = nome1.split(",");
		
		
		Map<String, List<String>> map = new HashMap<>();
		List<String> listNomes1 = new ArrayList<>();
		
		for(int i = 0; i < splitCidade.length; i++) {
			listNomes1.add(splitNome1[i].trim());
			map.put(splitCidade[i].trim(), listNomes1);
		}
		
		//Verifica se um determinado valor existe dentro do mapa.
		if(map.get("Campinas").contains("Hugo")) {
			System.out.println("Esse mapa contem esse nome");
		}else {
			System.out.println("Não existe esse nome");
		}
		
		System.out.printf("%s", map.entrySet());
		
	}

}
