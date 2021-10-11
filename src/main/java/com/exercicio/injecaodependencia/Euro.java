package com.exercicio.injecaodependencia;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Euro implements Moeda{
	
	private double euro;
	
	private static final double VALOR_CAMBIO_DOLAR = 2;
	private static final double VALOR_CAMBIO_EURO = 2;

	@Override
	public double dolar(double valor) {
		this.euro = valor * VALOR_CAMBIO_DOLAR;
		System.out.println("Resultado da Classe Euro");
		return euro;
	}

	@Override
	public double euro(double valor) {
		this.euro = valor * VALOR_CAMBIO_EURO;
		System.out.println("Resultado da Classe Euro");
		return euro;
	}

	@Override
	public String toString() {
		return "O VALOR DO EURO ESTÁ: " + euro;
	}
	
	

}

