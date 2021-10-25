package com.exercicio.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ApplicationProgramming03 {
	public static void main(String[] args) {
		
		String name = "A.A.A.A";
		String email = "a@gmail.com";
		String cuit = "123";
		String numSap = "777777777";
		String cbu = "345";
		String countaContable = null; //Exceoption: IndexOutOfBoundsException
		
		List<String> listProvider = new ArrayList<>(Arrays.asList(name, email, cuit, numSap, cbu, countaContable));
		
		List<String> providerValue = listProvider.stream()
					.filter(value -> value != null)
					.collect(Collectors.toList());
		
		List<String> listOptional = Optional.ofNullable(listProvider)
														.orElseGet(() -> Collections.emptyList())
														.stream()
														.filter(npe -> Objects.nonNull(npe))
														.collect(Collectors.toList());
		
		System.out.println(listOptional);
		
		Map<String, String> map = new HashMap<>();
		
		map.put("name", providerValue.get(0));
		map.put("email", providerValue.get(1));
		map.put("cuit", providerValue.get(2));
		map.put("numSap", providerValue.get(3));
		map.put("cbu", providerValue.get(4));
		//map.put("countaContable", providerValue.get(5)); //Exceoption: IndexOutOfBoundsException
		
		System.out.println(map.values());
		
		
		System.out.println(providerValue.get(0));
		System.out.println(providerValue.get(1));
		System.out.println(providerValue.get(2));
		System.out.println(providerValue.get(3));
		System.out.println(providerValue.get(4));
		//System.out.println(providerValue.get(5)); //Exceoption: IndexOutOfBoundsException
		
		
		
	}

}
