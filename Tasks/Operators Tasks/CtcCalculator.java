package com.task4;

public class CtcCalculator {
	public static void main(String[] args) {
		
		// Basic Salary
		double basicSalary = 30000;
		
		// Salary Components
		double pf = basicSalary * (12.0/100); // 12% of Basic Salary
		double hra = basicSalary * (70.0/100); // 70% of Basic Salary
		double allowance = hra * (25.0/100); // 25% of HRA
		
		// Final CTC = Basic + PF + HRA + Allowance
		double ctc = basicSalary + pf + hra + allowance;
		
		// Printing Salary Details
		System.out.println("Basic Salary : "+basicSalary);
		System.out.println("PF : "+pf);
		System.out.println("HRA : "+hra);
		System.out.println("Allowance : "+allowance);
		System.out.println("CTC : "+ctc);
				
	}
}




