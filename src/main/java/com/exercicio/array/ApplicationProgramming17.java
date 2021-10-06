package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming17 {
	public static void main(String[] args) {
		
		/**
		 * 17. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
		 *     Escreva um programa que determine e escreva a quatidade de pessoas que possuem idade superior
		 *     a 35 anos.
		 * */
		
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		int idadeSuperior35 = 0;
		
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe uma idade: ");
			A[i] = input.nextInt();
			
			if(A[i] > 35) {
				idadeSuperior35++;
			}
		}
		System.out.print("quatidade de pessoas que possuem idade superior a 35 anos: " + idadeSuperior35);
	}

}
