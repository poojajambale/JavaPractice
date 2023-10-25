package com.swapping;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
//		System.out.println("Enter a & b :");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
		int a =10;
		int b = 20;
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}

}
