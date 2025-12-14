package com.task2;

public class RelationalOperations {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 10;
		
		boolean isEqual = num1==num2;
		System.out.println(isEqual);
		
		boolean isGreater = num3>num1;
		System.out.println(isGreater);
		
		boolean isLesser = num3 < num2;
		System.out.println(isLesser);
		
		boolean isGreaterOrEqual = num1 >= num2;
		System.out.println(isGreaterOrEqual);
		
		boolean isLesserOrEqual = num3 <= num2;
		System.out.println(isLesserOrEqual);
		
		boolean isNotEqual = num1 != num3;
		System.out.println(isNotEqual);
		
	}
}




