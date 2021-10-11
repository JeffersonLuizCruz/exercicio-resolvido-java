package com.exercicio.injecaodependencia;

public class CasaDeCambio implements Moeda{
	
	private double valorConvertidoReal;

	@Override
	public double dolar(double valor) {
		this.valorConvertidoReal = valor * 5.60; 
		return valorConvertidoReal;
	}

	@Override
	public double euro(double valor) {
		this.valorConvertidoReal = valor * 6.78;
		return valorConvertidoReal;
	}

	public CasaDeCambio(double valorConvertidoReal) {
		this.valorConvertidoReal = valorConvertidoReal;
	}

	public CasaDeCambio() {}

	public double getValorConvertidoReal() {
		return valorConvertidoReal;
	}

	public void setValorConvertidoReal(double valorConvertidoReal) {
		this.valorConvertidoReal = valorConvertidoReal;
	}
	
	

}
