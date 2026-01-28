package com;

public class WrapperDemo {
	
	static Integer num;
	
	public static void main(String[] args) {		
		
		int a = 10;              // primitive
        Integer b = a;           // auto-boxing
        int c = b;               // auto-unboxing

        System.out.println(num); // prints null

        String s = "20";
        int n = Integer.parseInt(s); // String → int
        System.out.println(n + 2);

        System.out.println(Integer.max(10, 15));
        System.out.println(Integer.min(5, 3));

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isUpperCase('A'));				
		
	}
}


/*

int a = 10;

Integer b = new Integer(20);
Integer c = Integer.valueOf(20);

// Java 5
Integer d = Integer.valueOf(a); // Primitive to Wrapper
int e = c.intValue(); // Wrapper to Primitive
// intValue() is instance method

// After Java 5
Integer f = e; // Auto Boxing
int g = f; // Auto Unboxing

System.out.println(num);	

Integer num = 10;
String num2 = "20";
System.out.println(num2 + 2);
System.out.println(num + 2);

int num3 = Integer.parseInt(num2);
System.out.println(num3 + 2);

System.out.println(Integer.max(10, 12));
System.out.println(Integer.min(10,5));

String num5 = String.valueOf(10);
System.out.println(num5+2);

Character char1 = Character.valueOf('A');
System.out.println(Character.isUpperCase('A'));
System.out.println(Character.isUpperCase('a'));
System.out.println(Character.isDigit('1'));
System.out.println(Character.isLetter('A'));
System.out.println(Character.toUpperCase('a'));
System.out.println(Character.isWhitespace(' '));

Integer num6 = 10;
System.out.println(num6.hashCode());
num6 = 12;
System.out.println(num6.hashCode());

*/
