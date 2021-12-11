package com.exercicio.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationProgramming02 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("apelido", "hugo");
		map.put("nome", "jefferson");
		map.put("sobrenome", "luiz");
		map.put("trabalho", "jeff");
		map.put("ultimo", "cruz");
		
		List<Map<String, String>> data = new ArrayList<>();
		data.add(map);
		
		//String result = data.get(0);
		System.out.println(data);
		for(Map<String, String> value : data) {
			System.out.println(value);
		}
		
		//System.out.println(result);
	}

}
