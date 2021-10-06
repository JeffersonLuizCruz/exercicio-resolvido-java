package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming11 {
	
	public static void main(String[] args) {
		
		/**
		 * Criar um vetor A com 10 elementos inteiros. Implementar
		 *  um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares.
		 * */
		
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		
		int qtd = 0;
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe um valor: ");
			A[i] = input.nextInt();
				
			if((A[i] % 2) == 0) {
				System.out.println("Esse é um valor PAR: " + A[i]);
				qtd++;
				
			}else {
				System.out.println("Esse é um valor IMPA: " + A[i]);
			}
		}
		
		System.out.println("Total de vezes de números pares: " + qtd);
		
	}

}
