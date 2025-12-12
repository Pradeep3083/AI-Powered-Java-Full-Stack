package com.arithmetic;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
				
		String name = "Pradeep";
    System.out.println(name);
    // Pradeep
		
		int num1 = 10;
		
		int num2 = 20;
		
		System.out.println(num1+num2+5);
		
		num1 = 15;

		// 15+20+10
		int num3 = num1+num2+10;
		
		System.out.println(num3);
		
		// String addition -> Concatenation
		
		String s1 = "FLM";
		String s2 = "Edutech";
		
		System.out.println(s1+" "+s2);
		
		System.out.println(s1+"1");
		// FLM + "1" = FLM1
		
		System.out.println(s1 + 1);
		// FLM + 1 = FLM1
		
		System.out.println(s1+num1);
		// FLM + 15 = FLM15
		
		System.out.println(num1+s1);
		// 15 + FLM = 15FLM
		
		System.out.println("1"+"2"+s1);
		// 12FLM
		
		System.out.println("1"+s1+"2");
		// 1FLM2
		
		System.out.println(1+s1+2);
		// 1FLM2
		
		System.out.println(1+2+s1);
		// 1 + 2 + FLM
		// 3 + FLM
		// 3FLM
		
		System.out.println(1+"2"+s1);
		//12FLM
		
		System.out.println("1+2"+s1);
		// "1+2" + "FLM"
		// 1+2FLM
		
		System.out.println(1 + 12 + 3 + "1" + s1 + 12 + 1);
		// 13 + 3 + "1" + "FLM" + 12 + 1
		// 16 + "1" + "FLM" + 12 + 1
		// "161" + "FLM" + 12 + 1
		// "161FLM+ + 12 + 1
		// "161FLM12" + 1
		// 161FLM121
		
		
		System.out.println(s1 + 1);
		// FLM - 1 is not supported
		
		System.out.println(s1 + 1.0);
		// FLM1.0
		
		float num5 = 2.0f;
		float num6 = 3.0f;
		int num7 = 3;
		System.out.println(num5+num6);
    // 2.0 + 3.0 = 5.0
		System.out.println(num5+num7);
		// 2.0 + 3 = 5.0
		
		System.out.println("Num 1 is: "+num1+" Num 2 is: "+num2);
    // Num 1 is: 15 Num 2 is: 20
		
		System.out.println("Num 3 is: "+num1+num2);
		// Num3 is : 1520
		// BODMAS
		
		System.out.println(num2-num1);
		
		num1 = 5;
		num2 = 10;
		System.out.println(num1*num2);
		
		System.out.println("Division: "+10/5); // 2
		System.out.println("Divisiob -> "+5/2); // 2
		System.out.println("Modulo -> "+5%2);
		
		System.out.println(10/3);
		System.out.println(10%3);
		System.out.println(11%3);
		
		System.out.println(5.0/2.0);
		System.out.println(5.0%2.0);
		System.out.println(10/3.0);
		System.out.println(11%3.0);
		
		// System.out.println(10/0);
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at com.arithmetic.ArithmeticOperators.main(ArithmeticOperators.java:109)
		
		System.out.println(0/10.0);
		
		System.out.println(10.0/0.0); // Infinity
		System.out.println(10/0.0);   // Infinity
		System.out.println(10.0/0);   // Infinity
		
		
		System.out.println(10.0/2);
		
		// Assignment Operator
		
		int num9 = 10; // DataType variable = value
		
		num9 = num9+5;
		System.out.println(num9);
		num9 += 10;
		System.out.println(num9);
		num9 -= 5;
		System.out.println(num9);
		num9 *= 2;
		System.out.println(num9);
		num9 /= 4;
		System.out.println(num9);
		num9 %= 4;
		System.out.println(num9);
		num9 %= 2.0; // 0
		num9 = 10;
		num9 %= 3.0; // reassign to integer
		// num9 = num9%3.0; 
		// not convert into integer because it will give float value
		System.out.println(num9);
		
	}
	
}
