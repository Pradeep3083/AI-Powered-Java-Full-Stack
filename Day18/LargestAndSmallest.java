package com.programs;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int[] arr = {13,5,17,8,23,15};
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<max) {
				min = arr[i];
			}
		}
		System.out.println("Largest Number: "+max);
		System.out.println("Smalles Number: "+min);
	}
}
