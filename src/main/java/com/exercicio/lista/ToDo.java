package com.exercicio.lista;

public class ToDo {
	
	private Integer prioridade;
	private String descricao;
	
	public ToDo() {}

	public ToDo(Integer prioridade, String descricao) {
		this.prioridade = prioridade;
		this.descricao = descricao;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ToDo [prioridade=" + prioridade + ", descricao=" + descricao + "]";
	}	
}
