package com.strings;

import java.util.Scanner;

public class LargestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		String input = sc.nextLine();
		char largestNumber ='0';
		for(int i=0;i<input.length();i++) {
			if(largestNumber<input.charAt(i)) {
				largestNumber = input.charAt(i);
			}
		}
		System.out.println(largestNumber);		
	}
}
