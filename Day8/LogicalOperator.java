package com.logical;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		boolean isMajor = true;
		
		boolean hasVoterId = false;
		
		boolean hasDrivingLicense = true;
		
		System.out.println(isMajor && hasVoterId);
		// true && false = false
		
		System.out.println(isMajor && hasDrivingLicense);
		// true && true = true
		
		System.out.println(hasVoterId && hasDrivingLicense);
		// false && true = false
		
		System.out.println(hasVoterId && false);
		// false && false = false
		
		System.out.println(isMajor || hasVoterId);
		// true || false = true
		
		System.out.println(hasVoterId || false);
		// false | false = false
		
		System.out.println(!(!hasVoterId));
		// !(!false) = false
		
		boolean large = (10>5) && (10>9);
		System.out.println(large);
		
		boolean value = (5>9) || (7<=7);
		System.out.println(value);
		
		
		// precedence - ! > && > ||
		boolean res = (10>5)||(5<=6) && (7>9);
					// T || T && F
					// T || F
					// T
		System.out.println(res);
		
		System.out.println((7>=7) || (6<=6) && (5>6) || (2>13));
						// T || T && F || F
						// T || F || F
						// T || F
						// F
		
		System.out.println((7>7) || (7<=7) || !false);
		
		System.out.println(10>5 || 5>7 && 10>12 || 20>40);
		// here JVM does not care here T || ....
		System.out.println("------------------");
		int a=10;
		System.out.println(a);
		System.out.println(true || (++a>5));
		// proof for JVM skipping the operations
		System.out.println(a);
		
		System.out.println("------------------");
		int b=10;
		System.out.println(b);
		System.out.println(false && (++b>5) || true);
		// proof for JVM skipping the operations
		System.out.println(b);
		
		
	}
	
}
