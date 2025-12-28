package com.strings;

import java.util.Scanner;

public class SubsetsLengthTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = sc.nextLine();
		int count = 0;
		
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<input.length();j++) {
				System.out.print(input.charAt(i)+""+input.charAt(j)+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);		
	}
}
