package com.exercicio.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationProgramming01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id = 0;
		String name = "";
		double salary = 0.0;
		
		List<Pessoa> listPessoa = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int register = input.nextInt();
		
		for(int i = 0; i < register; i++) {
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.println();
			System.out.print("Id:");
			id = input.nextInt();
			System.out.print("Name:");
			input.nextLine();
			name = input.nextLine();
			System.out.print("Salary:");
			salary = input.nextDouble();
			System.out.println();
			
			Pessoa p = new Pessoa();
			p.setId(id);
			p.setName(name);
			p.setSalary(salary);
			
			listPessoa.add(p);
		}
		

		System.out.print("Informe Id percent:");
		id = input.nextInt();

		Integer idPessoa = getIdPessoa(listPessoa, id);
		
		if(idPessoa == null) {
			System.out.println("No exist Pessoa");
		}else {
			System.out.println();
			System.out.print("Percent information:");
			double percent = input.nextDouble();
			listPessoa.get(idPessoa).percentSalary(percent);
			System.out.println();
			System.out.println(listPessoa.toString());
			
		}
		input.close();
		
	}
	
	public static Integer getIdPessoa(List<Pessoa> pessoas, int id) {
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getId() == id) {
				return  i;
			}
		}
		return null;
	}

}
