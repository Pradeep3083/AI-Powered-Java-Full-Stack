// package com.unary;

public class UnaryOperator {
	public static void main(String[] args) {
    
		int num1 = 15;
		int num2 = -20;
		System.out.println(+num1);
		System.out.println(-num1);
		System.out.println(+num2);
		System.out.println(-num2);
		
		boolean canVote = true;
		System.out.println(!canVote);
		
		boolean isMajor = false;
		System.out.println(!isMajor);
		
		// Increment & Decrement
		int num3 = 20;
		num3++;
		System.out.println(num3);
		num3--;
		System.out.println(num3);
		++num3;
		System.out.println(num3);
		--num3;
		System.out.println(num3);
		
		int num4 = 15;
		System.out.println(num4++); // 15
		System.out.println(num4); // 16
		System.out.println(++num4); // 17
		System.out.println(num4++); // 17
		System.out.println(num4); // 18
		System.out.println(++num4); // 19
		System.out.println(num4); // 19
		
		int num5 = 10;
		System.out.println(num5--); // 10
		System.out.println(num5); // 9
		System.out.println(--num5); // 8
		System.out.println(num5--); // 8
		System.out.println(--num5); // 6
		System.out.println(num5);
		
		int num6 = 20;
		int num7 = num6++;
		System.out.println(num6);
		System.out.println(num7);
		
		int num8 = 5;
		int num9 = 10;
		int result = num8 + num9++;
					// 5 + 10++
					// 5 + 10
					// 15
		System.out.println(result);
		System.out.println(num9);
		
		result = num8++ + ++ num9;
				// 5++ + ++11
				// 5 + 12
				// 17
		System.out.println(result);
		System.out.println(num8);
		System.out.println(num9);
		
		result = num8++ + ++num8;
				// 6++ + ++6
				// 6 + 8 = 14
		System.out.println(result);
		
		num8 = 8;
		result = num8++ + num8++ + ++num8;
				// 8 + 9 + 11
				// 28
		System.out.println(result);
		
		int num10 = 5;
		System.out.println(++num10 + num10++ - --num10);
		// 6 + 6 - 6
		// 6
		System.out.println(num10);
		
		int num11 = 10;
		System.out.println(--num11 + num11++ + ++num11);
		// 9 + 9 + 11
		// 29
		System.out.println(num11);
				
	}
}
