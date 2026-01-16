package com;

// Child class extending Animal
public class Dog extends Animal{
	
	// Instance variable of Dog Class
	int b = 20;
	
	// Instance variable
	String breed;
	
	Dog(){
		System.out.println("Dog object created...");
	}
	
	// Constructor using this keyowrd
	Dog(String breed){
		this.breed = breed;
	}
	
	// Instance method
	void sound() {
		// accessing current object variable
		System.out.println(this.breed);
		System.out.println("Barking...");
	}
	
	// Method showing access to parent and child variables
	void print() {
		System.out.println(this.a); // variable from Animal class
		System.out.println(this.b); // variable from Dog class
	}
	
}
