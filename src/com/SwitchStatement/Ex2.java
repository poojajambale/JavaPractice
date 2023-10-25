package com.SwitchStatement;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Enter a Name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		//String name = "Pooja";
		
		switch(name) {
		case "Pooja":
			System.out.println("Pooja");
			break;
			
		case "Rutuja": 
			System.out.println("Rutuja");	
			break;
			
		case "Rubi": 
			System.out.println("Rubi");	
			break;
			
		default:
			System.out.println("Invalid Name");
		}

	}

}
