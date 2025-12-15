// package com.relational;

public class RelationalOperator {
	
	public static void main(String[] args) {
    
		int num1 = 10;
		int num2 = 20;
		int num3 = 10;
		
		System.out.println(num1 == num2);
		
		boolean check = num1 == num2;
		System.out.println(check); // false
		
		System.out.println(num1 == num3); // true
		System.out.println(num1 > num2); // false
		System.out.println(num2 > num3); // true
		System.out.println(num1 < num3); // flase

		System.out.println(num1 < num2); // true
		System.out.println(num1 <= num3); // true
		
		System.out.println(num1 >= num2); // false
		System.out.println(num1 != num3); // false
		
		System.out.println(5 != 6); // true
		
	}
	
}
