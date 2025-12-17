package com.ifelsetask;

import java.util.Scanner;

public class GradeCalculatorByIfElse {
	public static void main(String[] args) {
		System.out.println("--- Grade Calculator using If-Else ---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		
		if(marks<0 || marks>100) {
			System.out.println("Invalid Marks");
		}else if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}else if(marks>=80) {
			System.out.println("Grade B");
		}else if(marks>=70) {
			System.out.println("Grade C");
		}else if(marks>=50) {
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
		}
		
	}
}



