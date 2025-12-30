package com.casting;

public class ExplicitTypeCasting {
    public static void main(String[] args) {

        // Example 1: short to byte (overflow)
        short s = 128;
        byte b = (byte) s;
        System.out.println("short: " + s);
        System.out.println("byte after casting: " + b); // -128

        // Example 2: float to int (precision loss)
        float f = 123.78f;
        int i = (int) f;
        System.out.println("float: " + f);
        System.out.println("int after casting: " + i); // 123

        // Example 3: long to int
        long l = 123456789L;
        int num = (int) l;
        System.out.println("long: " + l);
        System.out.println("int after casting: " + num);
    }
}




/*
public class ExplicitTypeCasting {
	public static void main(String[] args) {
		
		short s = 128;
		
		byte b = (byte) s;
		
		System.out.println(b);
		
		long l = 123456L;
		int i = (int) l;
		System.out.println(i);
		
		float f = 123.99f;
		int num = (int) f;
		System.out.println(num);
		
		double d = 678.989;
		int num2 = (int) d;
		System.out.println(num2);
	}
}

*/
