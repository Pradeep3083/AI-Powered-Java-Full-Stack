package com.methods;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2 t = new Test2();
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		double res = sumOfSquares(num1,num2);
		System.out.println("Result: "+res);
		
//		int res = t.sum(10,20);
//		System.out.println(res);
//		
//		int res2 = t.sum(50,60);
//		System.out.println(res2);
		
//		int res2 = t.sum(10,20);
//		System.out.println(res2);
		
	}
	
	static double sumOfSquares(int a, int b) {
		double squareOfA = calculateSquares(a);
		double sqaureOfB = calculateSquares(b);
		double res = squareOfA+sqaureOfB;
		return res;
	}
	
	static double calculateSquares(int a) {
		double square = Math.pow(a, 2);
		return square;
	}
	
}
