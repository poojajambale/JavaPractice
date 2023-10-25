package com.model;

public class PatternExample {

	public static void main(String[] args) {
		
//		square(3,5);
//		triangle(3,3);
		pyramid(5,5);

	}

	private static void pyramid(int n, int m) {
		for (int i = 0; i < n; n++) {
			for (int j1 = n-i; j1 > 1 ; j1--) {
				System.out.print("");
			}
			
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

	private static void triangle(int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	private static void square(int n, int m) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	
}
