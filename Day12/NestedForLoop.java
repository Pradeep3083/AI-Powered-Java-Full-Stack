package com.forloop;

public class NestedForLoop {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.println("i: "+i);
				System.out.println("j: "+j);
			}
		}
	}
}
