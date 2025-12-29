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
		
		String s3 = "PradeepSai";
		String s4 = "pradeepsai";
		// here s3 & s4 both are not same
		
		String s5 = new String("Psl");
		String s6 = new String("Psl");
		// when we create an object it will take a new memory in the heap area
		// It does not care about the value it will store in the new memory only
		
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s5==s6); // false
		
		System.out.println(s5.equals(s6)); // true
		// for comparing string we have to use .equals() method
		
		
	}
}
