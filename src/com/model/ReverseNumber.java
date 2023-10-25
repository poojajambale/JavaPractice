package com.model;

public class ReverseNumber {

	public static void main(String[] args) {
		int arr[] = {3,4,1,6,0};
		int n = arr.length;
		
		int revArr[] = new int[n]; 
		
		for(int i = 0; i < n; i++) {
			revArr[n - (n - i)] = arr[n - (i + 1)];
		}
		
		for(int i = 0; i < revArr.length; i++) {
			System.out.println(revArr[i]+ " ");
		}
		
	}

}
