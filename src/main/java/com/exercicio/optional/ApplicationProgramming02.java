package com.exercicio.optional;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ApplicationProgramming02 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("valor01", "Hugo");
		map.put("valor02", "Jeff");
		map.put("valor03", null);
		map.put("valor04", "Luiz");
		map.put("valor05", "Jefferson");
		
		Map<String, String> result = map.entrySet()
										.stream()
										.filter(value -> value.getValue() != null)
										.collect(Collectors.toMap(key -> key.getKey(), value -> value.getValue()));
		System.out.println(result);
		
		
		List<String> value = Optional.ofNullable(map.values())
														.orElseGet(() -> Collections.emptyList()) // orElseGet(Collections::emptyList)
														.stream()
														.filter(Objects::nonNull)
														.collect(Collectors.toList());
		System.out.println(value);
		
	}

}
