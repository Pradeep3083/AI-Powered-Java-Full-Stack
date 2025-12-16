package com.ternary;

public class TernaryOperator {
	public static void main(String[] args) {
		String res = (10>5) ? "10 is bigger number" : "5 is bigger number";
		System.out.println(res);
		
		int num1 = 5;
		int num2 = 2;
		
		String biggerNum = (num2>num1)? num2 + " is bigger": num1+" is bigger";
		System.out.println(biggerNum);
		
		int num3 = 0;
		String result = (num3>0) ? "Positive Number":"Negative Number";
		System.out.println(result);
		
		result = (num3>0) ? "Positive Number" : (num3==0)? "Zero": "Negative Number";
		System.out.println(result);
	}
}
