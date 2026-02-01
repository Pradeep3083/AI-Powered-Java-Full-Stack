package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		try {
			System.out.println("Enter first Number : ");
			int num1 = sc.nextInt();
			System.out.println("Enter second Number: ");
			int num2 = sc.nextInt();
			res = num1/num2;		
			System.out.println("Divided Number : "+res);
			System.out.println("Hii");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter only Numbers");
		}
//		catch(InputMismatchException | ArithmeticException e) {
//			System.out.println("Enter only Numbers");
//		}
		catch(ArithmeticException e) {
			System.out.println("Don't use zero");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
//		try {
//			try {
//				
//			}catch(Exception e) {
//				
//			}
//		}catch(Exception e) {
//			
//		}
		
		System.out.println(res);
		System.out.println("Bye...");
	}
}
