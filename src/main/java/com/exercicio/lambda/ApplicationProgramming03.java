package com.exercicio.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ApplicationProgramming03 {

	// Cliente por estado
	public static Map<String, List<Cliente>> agrupaPorEstado(List<Cliente> clientes) {

		Map<String, List<Cliente>> porEstado = new HashMap<>();
		for (Cliente cli : clientes) {
			String estado = cli.getEstado();

			List<Cliente> clientesEstado = porEstado.get(estado);

			if (clientesEstado == null) {
				clientesEstado = new ArrayList<>();
				porEstado.put(estado, clientesEstado);
			}
			clientesEstado.add(cli);
		}

		return porEstado;
	}
	// Lambda
	public static Map<String, List<Cliente>> agrupaPorEstadoLambida(List<Cliente> clientes) {
		

		return clientes.stream()
					   .collect(Collectors.groupingBy(cliente -> cliente.getEstado()));
//		return clientes.stream()
//				   .collect(Collectors.groupingBy(Cliente::getEstado));
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

		      //key = estado; value = lista de cliente que estar no estado
		      Map<String, List<Cliente>> clientesPorEstado = agrupaPorEstado(clientes);
		      
		      for (String estado : clientesPorEstado.keySet()) {
		         System.out.println(estado + ": " + clientesPorEstado.get(estado));

		      }
		      System.out.println("-----------");
		      Map<String, List<Cliente>> clientesPorEstadoLambda = agrupaPorEstadoLambida(clientes);
		      
		      for (String estado : clientesPorEstadoLambda.keySet()) {
		         System.out.println(estado + ": " + clientesPorEstadoLambda.get(estado));
		      }
		   }

}
