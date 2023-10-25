package com.model;

public class PalindromeProgram {

	public static void main(String[] args) {
		String s = "lole";
		boolean b = false;
		
		for(int i = 0, j = s.length(); i<j; i++, j--) {
			if(s.charAt(i) == s.charAt(j-1)) {
				b=true;
			} 
			else {
				b=false;
			}
		}
		if(b == true ) {
			System.out.println("Given string is Palindrome");
		}
		else {
			System.out.println("Given string is NOT palindrome");
		}		
	}
}
