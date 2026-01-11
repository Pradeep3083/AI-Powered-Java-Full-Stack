package com.task;

public class Animal {
	
	String type = "Animal";
	
	static boolean needsFood = true;
	
	void eat() {
		System.out.println("Animal is eating");
	}

	static void survive() {
		System.out.println("Animals need food to survive");
	}
	
}
