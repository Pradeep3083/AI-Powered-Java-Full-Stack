package com;

// Method Overloading Example
public class Calculator {
	
	// Method with two parameters
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	// Same method name, different parameters
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
}
