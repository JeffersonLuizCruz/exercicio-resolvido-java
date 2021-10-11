package com.exercicio.injecaodependencia;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerCambio {
	
	Moeda moeda;
	
	@Autowired
	public ControllerCambio(Moeda moeda) {
		this.moeda = moeda;
	}
	
	@PostConstruct
	public void printResult() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		moeda.dolar(5);
		System.out.println(moeda);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	@PostConstruct
	public void usandoNew() {
		System.out.println("-----------------------------------------------");
		Dolar dolar = new Dolar();
		dolar.dolar(5);
		
		System.out.println(dolar);

		System.out.println("-----------------------------------------------");
	}

}

