package com.exercicio.interfaces;

public class Compra implements Autorizavel, Imprimivel{

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	

	public Compra() {
	}

	public Compra(double valorTotal, String produto, String nomeCliente) {
		this.valorTotal = valorTotal;
		this.produto = produto;
		this.nomeCliente = nomeCliente;
	}
	
	@Override
	public String getCabecalhoDaPagina() {
		return this.getProduto() + " = " + getValorTotal();
		
	}

	@Override
	public String getCorpoDaPagina() {
		return this.getNomeCliente();
		
	}

	
	@Override
	public double getValorTotal() {
		
		return this.valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
