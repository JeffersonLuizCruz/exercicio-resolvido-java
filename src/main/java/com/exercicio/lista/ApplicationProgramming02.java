package com.exercicio.lista;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ApplicationProgramming02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String nome = "";
		
		Pessoa p1 = new Pessoa(0L, "Hugo", null);
		Pessoa p2 = new Pessoa(1L, "Jefferson", null);
		Pessoa p3 = new Pessoa(2L, "Luiz", null);
		Pessoa p4 = new Pessoa(3L, "Jeff", null);
		Pessoa p5 = new Pessoa(4L, "Carol", null);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4, p5);
		System.out.println("####Verificação de id####");
		System.out.print("Informe o nome da pessoa para listar seu id: ");
		nome = input.next();
		
		Long id = listaID(pessoas, nome);
		System.out.println();
		System.out.print("O usuário " + pessoas.get(id.intValue()).getName() + " tem o seguinte ID: " + id);
	}
	
	static Long listaID(List<Pessoa> pessoas, String nome) {
		for(Integer i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getName().equalsIgnoreCase(nome) ) {
				return i.longValue();
			}
		}
		return -1L;
	}

}
