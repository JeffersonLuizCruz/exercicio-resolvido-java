package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming18 {
	public static void main(String[] args) {
		
		/**
		 * 18. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
		 *     Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
		 * */
		
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		int idade = 0;
		
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe uma idade: ");
			A[i] = input.nextInt();
			
			if(A[i] > 35) {
				idade++;
			}
	}}

}
