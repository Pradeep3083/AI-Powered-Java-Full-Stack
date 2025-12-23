package com.methods;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hiii");
		
		Test t = new Test();
		
		int res1 = t.sumOfTwoNumbers();
		System.out.println(res1/10);
		
		int res2 = t.sumOfTwoNumbers();
		System.out.println(res2+10);
		
		int res3 = t.sumOfTwoNumbers();
		System.out.println(res3*2);
		
//		t.sum();	
//		System.out.println("Byee");
//		t.sum();
//		t.sum();
		
		
	}
	
//	void sum() { // Method Declaration
//		int a = 10;
//		int b = 20;
//		
//		System.out.println(a);
//		System.out.println(b);
//		int res = a+b;
//		System.out.println(res);
//	}
	
	int sumOfTwoNumbers() {
		
		System.out.println("In sum of 2 numbers: ");
		
		int a = 10;
		int b = 20;
		
		int res = a+b;
		
		return res;
		
	}
	
}
