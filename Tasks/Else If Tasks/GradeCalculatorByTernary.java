package com.ternarytask;

import java.util.Scanner;

public class GradeCalculatorByTernary {
	public static void main(String[] args) {
		System.out.println("--- Grade Calculator using Ternary Operator ---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		
		String result = (marks<0 || marks>100) ? "Invalid Marks" :
				(marks>=90 && marks<=100) ? "Grade A" :
				(marks>=80) ? "Grade B" :
				(marks>=70) ? "Grade C" :
				(marks>=50) ? "Grade D" : "Fail";
		
		System.out.println(result);
		
	}
}

