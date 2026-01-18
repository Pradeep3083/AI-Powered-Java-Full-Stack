package com;

public class Test1 {
	// JVM starts execution from this main method
	public static void main(String[] args) {
		
		// Creating Dog object (child class)
		Dog dog = new Dog("Golden Retriever");
		
		// Calling Dog Object (child class)
		dog.sound();
		
		// Accessing parent and child variables
		dog.print();
		
		// Calling parent class method using child object
		dog.print();
		
		// Creating Calculator object
		Calculator calc = new Calculator();
		
		// Compile-time polymorphism (method overloading)
		calc.sum(1, 2);
		calc.sum(1, 2, 3);
		
		// Calling overloaded main method
		main(10);
		
	}
	
	//Overloaded main method
	public static void main(int a) {
		System.out.println(a);
	}
	
}


