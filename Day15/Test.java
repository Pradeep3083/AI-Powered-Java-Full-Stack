package com.strings;

public class Test {
	public static void main(String[] args) {
		String s1 = "Pradeep";
		String s2 = "Pradeep Sai";
		
		System.out.println(s1);
		System.out.println(s2);
		s1 = "Pradeep Sai";
		System.out.println(s1); // Here it will create a new one and where "Pradeep" will be in the background only
		// After the GC will collect it.
		
		// code soon
		
		
	}
}
