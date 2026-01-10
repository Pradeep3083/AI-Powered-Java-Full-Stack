package com.task;

public class Dog extends LandAnimal{
	
	String breed;
	
	Dog(String breedName){
		breed = breedName;
	}
	
	void bark() {
		System.out.println("Dog is barking...");
	}
	
}
