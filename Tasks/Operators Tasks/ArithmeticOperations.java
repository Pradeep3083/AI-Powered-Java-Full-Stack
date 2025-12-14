package com.task1;

public class ArithmeticOperations {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int add = num1 + num2;
		System.out.println(num1+" + "+num2+" -> "+add);
		int sub = num1 - num2;
		System.out.println(num1+" - "+num2+" -> "+sub);
		int mul = num1 * num2;
		System.out.println(num1+" * "+num2+" -> "+mul);
		int div = num2 / num1;
		System.out.println(num2+" / "+num1+" -> "+div);
		
		System.out.println();
		
		float num3 = 5.0f;
		System.out.println(num1+" + "+num3+" -> "+(num1+num3));
		System.out.println(num1+" - "+num3+" -> "+(num1-num3));
		System.out.println(num1+" * "+num3+" -> "+(num1*num3));
		System.out.println(num1+" / "+num3+" -> "+(num1/num3));
		
	}

}


