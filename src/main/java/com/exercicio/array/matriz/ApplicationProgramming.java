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
		String[][] compromissos = new String[24][31];
		
		boolean condicao = false;
		byte menu = 0;
		int dia = 0;
		int hora = 0;
		
		while(!condicao) {
			System.out.println("Insira 1 para agendar compromisso");
			System.out.println("Insira 2 para consultar compromisso");
			System.out.println("Insira 0 para sair");
			
			menu = input.nextByte();
			
			if(Opcao.AGENDAR.getValor() == menu) {
				System.out.print("Informe o dia:");
				dia = input.nextInt();
				
				System.out.print("Informe a hora do compromisso:");
				hora = input.nextInt();
				
				if(dia <= 31 && hora <= 24) {
					System.out.print("Informe qual compromisso:");
					compromissos[dia][hora] = input.next();
				}else {
					System.out.print("Dia e Hora inválido");
				}
				
			} else if(Opcao.CONSULTAR.getValor() == menu) {
				System.out.println("Consulta do compromisso:");
				
					System.out.print("dia:");
					dia = input.nextInt();
					
					System.out.print("hora:");
					hora = input.nextInt();
					System.out.print("Seu compromisso para o dia " + dia + " as " + hora + "h é: ");
					System.out.println(compromissos[dia][hora]);
					
				
			} else if(Opcao.SAIR.getValor() == menu) {
				System.out.println("Sair");
				condicao = true;
			} else {
				System.out.println("Opção inválida, informe novamente");
			}
		}
	}
}
