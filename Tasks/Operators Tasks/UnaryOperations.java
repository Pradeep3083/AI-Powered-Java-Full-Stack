package com.task3;

public class UnaryOperations {
	
	public static void main(String[] args) {		
		short positiveNum = 10;
		short negativeNum = -5;		
		boolean bool = true;
		
		System.out.println("Unary plus on positive number: "+ +positiveNum);
		System.out.println("Unary minus on negative number: "+ -negativeNum);
		System.out.println("Logical NOT on boolean: "+ !bool);
		
		// Post-increment
		System.out.println("Post-increment: "+positiveNum++);
		System.out.println("After post-increment: "+ positiveNum);
		
		// Pre-increment
		System.out.println("Pre-increment: "+ ++positiveNum);
		
		// Post-increment
		System.out.println("Post-drecrement: "+ positiveNum--);
		System.out.println("After post-decrement: "+ positiveNum);
		
		// Pre-increment
		System.out.println("Pre-decrement: "+ --positiveNum);				
	}
}


