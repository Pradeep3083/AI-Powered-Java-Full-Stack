package com.strings;

public class StringTask1 {
	public static void main(String[] args) {
		
		String str = "abcde";
		
		for(int i=0;i<str.length();i++) {
			String ans = "";
			for(int j=i;j<str.length();j++) {
				String temp = str.substring(i, j+1);
				System.out.println(temp);
			}
		}
		
	}
}
