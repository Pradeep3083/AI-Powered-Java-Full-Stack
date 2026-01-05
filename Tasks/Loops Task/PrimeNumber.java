package com.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		PrimeNumber pm = new PrimeNumber();
		
		//pm.checkIsPrime1(num);
//		pm.checkIsPrime2(num);
//		pm.checkIsPrime3(num);
//		pm.checkIsPrime4(num);
//		pm.checkIsPrime5(num);
		pm.checkIsPrime6(num);
		
	}
	
	void checkIsPrime1(int num) {
		int count=0;
		long start = System.currentTimeMillis();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		long end = System.currentTimeMillis();
		
		if(count==1) {
			System.out.println("Neither Prime nor Composite");
		}
		else if(count==2) {
			System.out.println("Case 1: Prime Number");
		}
		else {
			System.out.println("Case 1: Not a Prime Number");
		}
		System.out.println("Total time: "+(end-start));
	}
	
	void checkIsPrime2(int num) {
		int count=0;
		for(int i=2;i<=num;i++) {
			if(num%i==0) count++;
		}
		
		if(count==1) {
			System.out.println("Case 2: Prime Number");
		}
		else{
			System.out.println("Case 2: Not a Prime Number");
		}
		
	}
	
	void checkIsPrime3(int num) {
		int count=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) count++;
		}
		
		if(count==0) {
			System.out.println("Case 3: Prime Number");
		}
		else{
			System.out.println("Case 3: Not a Prime Number");
		}
		
	}
	
	void checkIsPrime4(int num) {
		int count=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) count++;
		}
		
		if(count==0) {
			System.out.println("Case 4: Prime Number");
		}
		else{
			System.out.println("Case 4: Not a Prime Number");
		}
		
	}
	
	void checkIsPrime5(int num) {
		int count=0;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) count++;
		}
		
		if(count==0) {
			System.out.println("Case 4: Prime Number");
		}
		else{
			System.out.println("Case 4: Not a Prime Number");
		}
		
	}
	
	void checkIsPrime6(int num) {
		int count=0;
		long start = System.currentTimeMillis();
		for(long i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		long end = System.currentTimeMillis();
		
		if(count==0) {
			System.out.println("Case 4: Prime Number");
		}
		else{
			System.out.println("Case 4: Not a Prime Number");
		}
		System.out.println("Total time: "+(end-start));
	}
	
}
