package com.userinput;

import java.util.Scanner;

public class ScannerDemo {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter your salary: ");
		double salary = sc.nextDouble();
		
		sc.nextLine(); // buffer clear
		
		System.out.print("Enter your city: ");
		String city = sc.nextLine();
		
		System.out.println();
		System.out.println("--- User Details ---");
		System.out.println("Name   : "+ name);
		System.out.println("Age    : "+ age);
		System.out.println("Salary : "+ salary);
		System.out.println("City   : "+ city);
		
	}
}


/*

System.out.println("Enter base Salary: ");
		Scanner sc = new Scanner(System.in);
		int baseSalary = sc.nextInt();
		System.out.println("Basic Salary is: "+baseSalary);
		

		System.out.println("Enter short value: ");
		int shortValue = sc.nextShort();
		System.out.println("Basic Salary is: "+baseSalary);
		
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Name is: "+name);
		
		System.out.println("Enter Name: ");
		String name2 = sc.next();
		System.out.println("Name is: "+name2);
		
		// for sc.nextLine() - here enter is a character
				
		sc.nextShort();
		sc.nextByte();
		sc.nextInt();
		sc.nextFloat();
		sc.nextDouble();
		sc.nextLong();
		sc.nextLine();
		sc.next();

*/


