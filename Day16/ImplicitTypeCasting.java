package com.casting;

public class ImplicitTypeCasting {
    public static void main(String[] args) {

        byte b = 10;
        System.out.println("byte: " + b);

        short s = b;      // byte to short
        System.out.println("short: " + s);

        int i = s;        // short to int
        System.out.println("int: " + i);

        long l = i;       // int to long
        System.out.println("long: " + l);

        float f = l;      // long to float
        System.out.println("float: " + f);

        double d = f;     // float to double
        System.out.println("double: " + d);

        // char to int (Unicode)
        char ch = 'A';
        int ascii = ch;
        System.out.println("Unicode of A: " + ascii);
    }
}







/*
public class ImplicitTypeCasting {
	public static void main(String[] args) {
		
		
		float num5 = 100.234f;
		
		double num6 = 100244.23456;
		
		double num7 = num6;
		
		char c = '5';
		
		// ASCII = American Standard Code for Information Interchange
		// 128 charcaters 
		// Unicode support around 65536 characters
		int num8 = c;
		System.out.println(c);
		System.out.println(num8);
		
		System.out.println('A'+1);		
		
	}
}
*/
