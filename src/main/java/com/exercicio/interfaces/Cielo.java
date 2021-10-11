package com.exercicio.interfaces;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().equals("123456") && autorizavel.getValorTotal() < 100;
	}

}
