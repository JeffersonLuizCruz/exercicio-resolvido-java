package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming02 {
	public static void main(String[] args) {
		
		/**
		 * 02 - Criar um vetor A com 8 elementos inteiros. constuir um vetor B de mesmo tipo e 
		 * tamnho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.
		 * */
		
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[5];
		int[] B = new int[5];
		
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe um valor: ");
			A[i] = input.nextInt();
			
			B[i] = A[i] * 2;
		}
		
		System.out.println("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		
		System.out.println();
		
		System.out.println("Vetor B = ");
		for(int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
