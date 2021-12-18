package com.exercicio.lista;

import java.util.ArrayList;
import java.util.List;

import com.exercicio.lambda.Cliente;

public class ApplicationProgramming08 {

	public static List<List<String>> agruparPorEstado(List<Cliente> clientes) {
		List<List<String>> resultadoAgrupamento = new ArrayList<>();

		List<String> agrupaPorNome = new ArrayList<>();
		List<String> agrupaPorEstado = new ArrayList<>();

		for (int i = 0; i < clientes.size(); i++) {
			String resultPorNome = clientes.get(i).getNome();
			agrupaPorNome.add(resultPorNome);

			String resultadoPorEstado = clientes.get(i).getEstado();
			agrupaPorEstado.add(resultadoPorEstado);
		}
		resultadoAgrupamento.add(agrupaPorNome);
		resultadoAgrupamento.add(agrupaPorEstado);

		return resultadoAgrupamento;
	}

	public static void main(String[] args) {
		
		  List<Cliente> clientes = new ArrayList<>();
		
	      clientes.add(new Cliente("José", "Campinas", "SP"));
	      clientes.add(new Cliente("Pedro", "Campinas", "SP"));
	      clientes.add(new Cliente("João", "São Paulo", "SP"));
	      clientes.add(new Cliente("Ana", "Recife", "PE"));
	      clientes.add(new Cliente("Fabiana", "Campo Grande", "MS"));
	      clientes.add(new Cliente("Cristiane", "Rio de Janeiro", "RJ"));
	      clientes.add(new Cliente("Fabricio", "Campinas", "SP"));
	      clientes.add(new Cliente("Julia", "Campo Grande", "MS"));
	      clientes.add(new Cliente("Fábio", "São Paulo", "SP"));
	      
	      List<List<String>> resultDoAgrupamento = agruparPorEstado(clientes);
	      
	      for(int i = 0; i < clientes.size(); i++) {
	    	  for(int j = 0; j < clientes.size(); j++) {
	    		  try {
	    			  System.out.printf("%s", resultDoAgrupamento.get(i).get(j) + " ");
				} catch (IndexOutOfBoundsException e) {

				}
	    	  }
	    	  System.out.println("");
	      }
	}

}
