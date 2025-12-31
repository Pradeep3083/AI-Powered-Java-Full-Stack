package com.programs;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {10,20,15,28,34};
		int newArr[] = reverseArray(arr);
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
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
}
