package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming16 {
	public static void main(String[] args) {
		/**
		 * 16. Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
		 *  a) a soma de elementos armazenados neste vetor que são inferiores a 15;
		 *  b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
		 *  c) a média dos elementos armazenados no vetor que são superiores a 15.
		 * */
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		int somaMenor15 = 0;
		int igual15 = 0;
		int mediaSuperior15 = 0;
		int somaSupior15 = 0;
		int qtdSuperior15 = 0;
		
		for(int i = 0; i < A.length; i++) {
			System.out.print("Informe um valor: ");
			A[i] = input.nextInt();
			
			if(A[i] < 15) {
				somaMenor15 += A[i];
			}
			
			if(A[i] == 15) {
				igual15++;
			}
			
			if(A[i] > 15) {
				qtdSuperior15++;
				somaSupior15 += A[i];
			}
		}
		
		mediaSuperior15 = somaSupior15 / qtdSuperior15;
		
		System.out.println("A soma de elementos armazenados neste vetor que são inferiores a 15: " + somaMenor15);
		System.out.println("A quantidade de elementos armazenados no vetor que são iguais a 15: " + igual15);
		System.out.println("A média dos elementos armazenados no vetor que são superiores a 15: " + mediaSuperior15);
	}

}
