package com.exercicio;

public class ApplicationProgrammingTest {
	public static void main(String[] args) {
		
		int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] nome = {"Jeff Luiz Cruz"};
		for (int i = 0; i < numero.length; i++) { 
		    if (i % 2 != 0) {
		        System.out.println("Numero valido!, valor impar:".substring(0,6));
		    }
		}
	}
}
