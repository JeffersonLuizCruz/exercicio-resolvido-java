package com.exercicio;

public class ApplicationProgrammingTest {
	public static void main(String[] args) {
		
		String s = "01234010";
		s = s.replaceFirst ("^0", "");
		
		String concatencao = "";
		String nome1 = "hugo";
		String nome2 = "luiz";
		String[] array = {"hugo", "jeff", "luiz", "carol"};
		

		for(int i = 0; i < array.length; i++) {
			
		String result = "";
			
		if(nome1.contains(array[i])) {
			result = nome1.substring(0,2);
		}
		
		if(nome2.contains(array[i])) {
			result = nome2.substring(2,4);
		}
		concatencao += result;
	}
		
		
		System.out.println(concatencao);
	}

}
