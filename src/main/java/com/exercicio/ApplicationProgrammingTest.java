package com.exercicio;

import java.util.ArrayList;
import java.util.List;

public class ApplicationProgrammingTest {
	public static void main(String[] args) {
		
		String nome = "jefferson luiz cruz ana carolina oliveira";
		String[] arrayDeNome = nome.split(" ");

		List<List<String>> listNomes = new ArrayList<>();
		List<String> nomes = new ArrayList<>();
		for(String valueNome : arrayDeNome) {
			nomes.add(valueNome);
		}
		listNomes.add(nomes);
		
		System.out.println(listNomes);
		System.out.println(nomes);
		
		
	}
}
