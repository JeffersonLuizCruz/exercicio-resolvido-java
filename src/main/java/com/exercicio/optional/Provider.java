package com.exercicio.optional;

public class Provider {
	
	private String name;

	
	public Provider() {
		super();
	}


	public Provider(String name) {
		super();
		this.name = name;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Provider [name=" + name + "]";
	}
	
	
	
}
