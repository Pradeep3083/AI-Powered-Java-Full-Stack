package com.programs;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = {10,2,12,11,8};
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
		
	}
}
