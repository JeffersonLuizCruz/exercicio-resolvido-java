package com.exercicio.csv;

public class TamplateCSV {
	
	private String categoria;
	private String produto;
	private Double preco;
	private String catelago;
	
	
	
	
	public TamplateCSV() {}
		
	public TamplateCSV(String categoria, String produto, Double preco, String catelago) {
		this.categoria = categoria;
		this.produto = produto;
		this.preco = preco;
		this.catelago = catelago;
	}

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCatelago() {
		return catelago;
	}
	public void setCatelago(String catelago) {
		this.catelago = catelago;
	}

	@Override
	public String toString() {
		return "TamplateCSV [categoria=" + categoria + ", produto=" + produto + ", preco=" + preco + ", catelago="
				+ catelago + "]";
	}
	
	
}
