package com.twodarrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayTask {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Array with 3 X 5
		int[][] arr = new int[3][5];
		
		System.out.println("Enter Elements: ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print("Enter eement for position "+i+" "+j+": ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int[] num : arr) {
			System.out.println(Arrays.toString(num));
		}
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
	}
}
