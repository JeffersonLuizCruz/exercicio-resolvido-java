package com.exercicio.lista;

import java.util.Arrays;
import java.util.List;

/**
 * Exemplo de percorrer uma lista com for aprimorado e o for tradicional
 */
public class ApplicationProgramming06 {

	public static void main(String[] args) {

		List<String> array = Arrays.asList("Hugo", "Jefferson", "Jeff", "Luiz");

		// for tradicional
		for (int i = 0; i < array.size(); i++) {
			String result = array.get(i);

			if (result.contains("Hugo")) {
				System.out.println("Ex01 : Existe esse nome dentro do Array: " + array.get(i));
			}
		}
		// for aprimorado
		for (String value : array) {
			if (value.contains("Hugo")) {
				System.out.println("Ex02 : Existe esse nome dentro do Array: " + value);
			}
		}
	}

}
