package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming {
	public static void main(String[] args) {
		/**
		 * 04 - Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho,
		 * 		 sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento
		 * 		 de A, ou seja: B[i] = sqrt(A[i])
		 * */
		
		
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[15];
		int[] B = new int[15];
		
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe um valor: ");
			A[i] = input.nextInt();
			
			B[i] = (int) Math.sqrt(A[i]);
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
	}

}
