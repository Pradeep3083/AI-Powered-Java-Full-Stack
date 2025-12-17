package com.ifelse;

public class IfCondition {
	public static void main(String[] args) {
		
		int num = -5;		
		if(num>0) {
			System.out.println("Positive Number");
		}else if(num<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
		
	}	
}


/*

int num = 4;				
		if(num>5) {
			System.out.println(num+" is bigger");
		}
		else {
			System.out.println(num +" is smaller");
		}
		
		int num2 = -5;
		if(num2>0) {
			System.out.println(num2+" is a positive number");
		}
		else if(num2<0) {
			System.out.println(num2+" is a negative number");
		}
		else {
			System.out.println(num2+" is zero");
		}
		
		
		boolean isMajor = true;
		boolean canVote = false;
		
		if(isMajor) {
			if(canVote) {
				System.out.println("He is Major and eligible to vote");
			}else {
				System.out.println("He is Major but not eligible to vote");
			}
		}else {
			System.out.println("He is Minor");
		}

*/
