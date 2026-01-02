package com.programs;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = {10,2,12,11,8};
		System.out.println("Before Sorting: ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<(arr.length-1-i);j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting: ");
		System.out.println(Arrays.toString(arr));
		
	}
}
