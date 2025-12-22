package com.practice;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Original Number: "+num);
		int rev = 0;
		
		while(num>0) {
			int digit = num%10;
			rev = (rev*10)+digit;
			num = num/10;
		}
		
		System.out.println("Reverse Number: "+rev);
		
	}
}
