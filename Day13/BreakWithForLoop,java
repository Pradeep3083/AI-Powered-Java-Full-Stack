package com.forloop;

public class BreakWithForLoop {
	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			System.out.println("i: "+i);
//			if(i==3) {
//				break;
//			}
//		}
		
		// Label
		outer :
		for(int i=1;i<=5;i++) {
			System.out.println("i: "+i);
			
			inner :
			for(int j=0;j<5;j++) {
				System.out.print("j: "+j+" ");
				if(j==2) break inner;
			}
			System.out.println();
		}
		
	}
}
