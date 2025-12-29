package com.strings;

import java.util.Scanner;

public class FirstRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = sc.nextLine();
		boolean found = false;
		
		outer:
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) {
					System.out.println(input.charAt(i));
					found = true;
					break outer;
				}
			}
		}
		if(!found) {
			System.out.println("No repeating character");
		}
		
	}
}
