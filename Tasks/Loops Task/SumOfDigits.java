package com.practice;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		// Task to print Sum of Digits of a Number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		System.out.println(sum);
	}
}
