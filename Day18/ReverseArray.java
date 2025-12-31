package com.programs;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {10,20,15,28,34};
		//int[] revArray = reverseArray(arr);
		int[] newArr2 = reverseArray2(arr);
		
//		for(int i=0;i<revArray.length;i++) {
//			System.out.print(revArray[i]+" ");
//		}
		
		// Enhanced For Loop / for each
		for(int num : newArr2) {
			System.out.print(num+" ");
		}		
	}
	
	static int[] reverseArray(int[] arr){
		int[] newArr = new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			int temp = arr[i];
			newArr[j] = temp;
			j++;
		}
		return newArr;
	}
	
	static int[] reverseArray2(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start <= arr.length/2) {	
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	
}
