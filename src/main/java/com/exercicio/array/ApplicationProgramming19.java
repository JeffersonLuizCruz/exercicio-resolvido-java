package com.exercicio.array;

import java.util.Scanner;

public class ApplicationProgramming19 {
	public static void main(String[] args) {
		/**
		 * 19. Ler as duas notas bimestrais para um conjuto de 10 alunos. Armazenar as notas informadas
		 *	   em dois vetores "Nota1" e "Nota2" do tipo real. Escreva um programa que calcule a média aritmétrica
		 *     simples das notas informadas armazenando o resultado em um vetor "Result" de mesmo tipo e tamanho. 
		 *     Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7 o 
		 *     aluno estará "aprovado", caso contrário, a situação do aluno será "reprovado".
		 * */
		Scanner input = new Scanner(System.in);
		
		String[] aluno = new String[3];
		double[] nota1 = new double[3];
		double[] nota2 = new double[3];
		
		double[] result = {0,0,0};
		
		for(int i = 0; i < nota1.length; i++) {
			System.out.print("Informe nome do aluno: ");
			aluno[i] = input.next();	
			
			System.out.print("Informe a primeira nota: ");
			nota1[i] = input.nextDouble();
			
			System.out.print("Informe a segunda nota: ");
			nota2[i] = input.nextDouble();
			
			result[i] = (nota1[i] + nota2[i]) / 2;
			
			System.out.println();

		}
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			
		System.out.println("Aluno: " + aluno[i]);
		System.out.println("Media: " + result[i]);
		
		if(result[i] >= 7) {
			System.out.println("Aluno Aprovado");
		}else {
			System.out.println("Aluno Reprovado");
		}
		System.out.println();
		}
	}
}
