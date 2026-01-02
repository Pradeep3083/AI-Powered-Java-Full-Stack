Arrays:

[10,1,12,4,26]

sort this array in ascending order

[1,4,10,12,26]


Bubble sort:


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
		System.out.println("After Sorting: " + Arrays.toString(arr));
		
		
		
	}
}




2D Arrays:

int[][] arr = new int[2][2];


Task:

Create 3 X 5 jagged array
Take inputs dynamically from user

print back all values as a matrix




