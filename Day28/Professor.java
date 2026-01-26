package com;

public class Professor {
	String name;
	int exp;
	
	public Professor(String name, int exp) {
		super();
		this.name = name;
		this.exp = exp;
	}
	
	public Professor() {
		
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", exp=" + exp + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
