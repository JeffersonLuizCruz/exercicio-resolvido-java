package com.exercicio.array.matriz;

public enum Opcao {
	AGENDAR(1),
	CONSULTAR(2),
	SAIR(0);
	
	private int valor;
	
	private Opcao() {}

	private Opcao(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}
