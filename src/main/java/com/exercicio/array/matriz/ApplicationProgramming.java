package com.exercicio.array.matriz;

import java.util.Scanner;

/**
 * Faça um programa para armazenar em uma matriz os COMPROMISSOS de uma agenda pessoal. 
 * CAda dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos 
 * associar uma tarefa específica(compromisso agendado). O programa deve ter um menu 
 * onde o usuário indica o dia do mês QUE DESEJA ALTERAR E A HORA, entrando em seguida 
 * com o compromisso, ou então, o usuário pode atambém consultar a AGENDA, 
 * FORNECENDO O DIA E A HORA PARA OBTER O COMPROMISSO ARMAZENADO.
 * */
public class ApplicationProgramming {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] compromisso = new int[24][31];
		
		boolean condicao = false;
		byte menu = 0;
		int dia = 0;
		int hora = 0;
		compromisso[dia][hora] = compromisso[dia][hora];
		while(!condicao) {
			System.out.println("Insira 1 para agendar compromisso");
			System.out.println("Insira 2 para consultar compromisso");
			System.out.println("Insira 0 para sair");
			
			menu = input.nextByte();
			
			if(Opcao.INSERIR.getValor() == menu) {
				System.out.println("Informe o dia:");
				dia = input.nextInt();
				
				System.out.println("Informe a hora do compromisso:");
				hora = input.nextInt();
				
				if(dia >= 31 && hora >= 24) {
					compromisso[dia][hora] = compromisso[dia][hora];
				}
			} else if(Opcao.CONSULTAR.getValor() == menu) {
				System.out.println("Consulta");
				System.out.println("dia e hora " + compromisso[dia][hora]);
			} else if(Opcao.SAIR.getValor() == menu) {
				System.out.println("Sair");
				condicao = true;
			} else {
				System.out.println("Opção inválida, informe novamente");
			}
		}
	}

}
