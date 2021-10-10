package com.exercicio.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ApplicationProgrammingTeste {
	

	static Optional<Object> filterVariableNull(String value) {
		return Optional.ofNullable(value);
		
	}
	
	static Optional<Object> filterVariableNull(Integer value) {
		return  Optional.ofNullable(value);
		
	}
	public static void main(String[] args) {
		String result = null;
		//filterVariableNull(result).ifPresent(n -> System.out.println(n));
		Object valor1 = filterVariableNull(result).orElse("----");
		System.out.println((String)valor1);
		
		Optional<Object> valor2 = filterVariableNull(result);
		System.out.println(valor2);
		
		System.out.println(filterVariableNull(result).orElse("valor nullo"));
		
		List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,null,4,5,6));
		
		Integer soma = 0;
		for(Integer value : numeros) {
			
			soma += (Integer)filterVariableNull(value).orElse(0);
		}
		
		System.out.println(soma);
	}

}
