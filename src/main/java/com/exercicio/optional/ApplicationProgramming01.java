package com.exercicio.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/**
 * Os métodos Optional mais importantes:
 * 
 * - ofNulllabe()
 * - ifPresent()
 * - orElse()
 * - orElseGet()
 * - orElseThrow()  
 * */
public class ApplicationProgramming01 {
	
	static Optional<String> verifyExistNPE(String value) {
		return Optional.ofNullable(value);
	}
	
	static Optional<Object> verifyExistNPE(Integer value) {
		return Optional.ofNullable(value);		
	}
	
	public static void main(String[] args) {
		String result = null;
		String name1 = "Hugo";
		String name2 = null;
		/**
		 * Optional: ifpreset()
		 * Se um valor estiver presente, executa a ação do valor, caso contrário, não faz nada.
		 * */
		
		//Exemplo: 01
		verifyExistNPE(result).ifPresent(n -> System.out.println(n));

		//Exemplo: 02
		Object valor1 = verifyExistNPE(result).orElse("----");
		System.out.println((String)valor1);
		
		//Exemplo: 03
		Optional<String> valor2 = verifyExistNPE(result);
		System.out.println(valor2);
		
		//Exemplo: 04
		System.out.println(verifyExistNPE(result).orElse("valor nullo"));
		
		//Exemplo: 05
		Optional<String> getName2 = verifyExistNPE(name2);
		System.out.println(getName2.equals(name1) ? name1 : getName2.orElse("Valor vazio"));
		
		List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,null,4,5,6));
		
		Integer soma = 0;
		for(Integer value : numeros) {
			
			soma += (Integer)verifyExistNPE(value).orElse(0);
		}
		//Exemplo: 06
		System.out.println(soma);
		
		Provider p = new Provider();
		p.setName(null);
		
		Object nomeProvider = verifyExistNPE(p.getName()).orElse("");
		
		System.out.println("Nome do provedor: " + nomeProvider);
		
	}

}
