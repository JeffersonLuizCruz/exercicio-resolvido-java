package com.exercicio.interfaces;

public class Epson implements Impressora {
	
	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("***************************************************");
		System.out.println(imprimivel.getCabecalhoDaPagina());
		System.out.println("***************************************************");
		System.out.println(imprimivel.getCorpoDaPagina());
		System.out.println();
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
		System.out.println("////		Epson 	///");
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");

	}

}
