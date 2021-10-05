package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming01 {
	
	public static void main(String[] args) {
		
		/**
		 * 01 - Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo
		 * 		e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
		 * */
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[5];
		int[] B = new int[5];
		
		
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe um valor para o Array:");		
			A[i] = input.nextInt();
			
			B[i] = A[i];
		}
		
		
		System.out.print("Vetor A = ");		
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");					
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");		
		for(int i = 0; i < B.length; i++) {	
			System.out.print(B[i] + " ");					
		}
		System.out.println();
		
		
	}

}
