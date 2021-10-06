package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming12 {
	public static void main(String[] args) {
		/**
		 * Criar um vetor A com 10 elementos inteiros.
		 *  Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor.
		 * */
		
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		int totalSoma = 0;
		
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe um valor: ");
			A[i] = input.nextInt();
			
			totalSoma += A[i];
		}
		
		System.out.println("Total de elementos: " + totalSoma);
		
	}

}
