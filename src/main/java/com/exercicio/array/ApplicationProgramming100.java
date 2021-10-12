package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming100 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String estados[] = new String[10];
		boolean encontrou = false;
		
		estados[0] = "CE";
		estados[1] = "PE";
		estados[2] = "BH";
		estados[3] = "PI";
		estados[4] = "SP";
		estados[5] = "RJ";
		estados[6] = "AL";
		estados[7] = "MA";
		estados[8] = "PB";
		estados[9] = "SC";
		
		
		System.out.print("Informe o estado: ");
		String encontra = input.next();
		for(int i = 0; i < estados.length; i++) {
			if(estados[i].equalsIgnoreCase(encontra)) {
				encontrou = true;
				break;
			}
		}
		
		if(encontrou == true) {
			System.out.println("Estado encontrado");
		}else {
			System.out.println("Estado não encontrado");
		}
	}

}
