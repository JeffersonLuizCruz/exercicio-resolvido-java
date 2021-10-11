package com.exercicio.injecaodependencia;

import org.springframework.stereotype.Service;

@Service
public class Dolar implements Moeda{
	
	private double dolar;
	
	private static final double VALOR_CAMBIO_DOLAR = 6.65;
	private static final double VALOR_CAMBIO_EURO = 3.35;

	@Override
	public double dolar(double valor) {
		this.dolar = valor * VALOR_CAMBIO_DOLAR;
		System.out.println("Resultado da Classe Dolar");
		return dolar;
	}

	@Override
	public double euro(double valor) {
		this.dolar = valor * VALOR_CAMBIO_EURO;
		System.out.println("Resultado da Classe Dolar");
		return dolar;
	}

	@Override
	public String toString() {
		return "O VALOR DO DOLAR ESTÁ: " + dolar;
	}
	
	

}

