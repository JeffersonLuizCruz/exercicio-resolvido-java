package com.exercicio.interfaces;

public class ApplicationTest {
	
	public static void main(String[] args) {
		
		Operadora operadora = new Cielo();
		Impressora impressora = new Epson();

		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Jeferson");
		cartao.setNumeroCartao("123456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Jefferson");
		compra.setProduto("Arroz");
		compra.setValorTotal(45);
		
		Checkout chekout = new Checkout(operadora, impressora);
		chekout.fecharCompra(compra, cartao);
	}

}
