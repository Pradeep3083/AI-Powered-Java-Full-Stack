package com.strings;

import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = sc.nextLine();
		String result = "";
		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(i%2==0) {
				if(ch>='a' && ch<='z') {
					result += (char) (ch-32);
				}else {
					result += ch;
				}
			}else {
				if(ch>='A' && ch<='Z') {
					result += (char)(ch+32);
				}else {
					result += ch;
				}
			}
		}
		System.out.println(result);		
	}
}
