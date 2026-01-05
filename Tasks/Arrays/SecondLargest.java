package com.programs;

public class SecondLargest {
	public static void main(String[] args) {
		
		int[] arr = {10,25,16,17,20};
		
		int largest = arr[0];
		int secondLargest = arr[0];
		
		// First pass: find largest
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		// Second pass: find second largest
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest) {
				if(secondLargest == largest || arr[i] > secondLargest) {
					secondLargest = arr[i];
				}
			}
		}
		
		System.out.println("Second Largest Number: "+secondLargest);
		
	}
}
