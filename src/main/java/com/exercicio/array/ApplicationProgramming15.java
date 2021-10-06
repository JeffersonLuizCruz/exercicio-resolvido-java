package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming15 {
	public static void main(String[] args) {
		/**
		 * 15. Criar um vetor A com 10 elementos inteiros. Desenvolver
		 * um programa que defina o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.
		 * */
		
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		int total = 0;
		int qtdPar = 0;
		int qtdImpa = 0;
		double porcentImpa = 0;
		double porcentPar = 0;
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe um valor: ");
			A[i] = input.nextInt();
			total++;
			
			if((A[i] % 2) == 0) {
				qtdPar++;
				
			}else {
				qtdImpa++;
				
			}
		}
		porcentImpa = (qtdImpa * 100) / total;
		porcentPar = (qtdPar * 100) / total;
		System.out.println("Porcentagem valor par: " + porcentPar);
		System.out.println("Porcentagem valor ímpa : " + porcentImpa);
	}

}
