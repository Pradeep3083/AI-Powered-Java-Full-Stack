package com;

public class Dog extends Animal{
	
	int b = 20;
	
	String breed;
	
	Dog(){
		System.out.println("Dog object created...");
	}
	
	Dog(String dogBreed){
		breed = dogBreed;
	}
	
	void print() {
		System.out.println(this.b);
		System.out.println(this.a);
	}
	
	void sound() {
		System.out.println(this.breed);
		System.out.println("Barking...");
	}
}
