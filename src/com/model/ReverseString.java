package com.model;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Pooja";
		char[] c = s.toCharArray();
		String rev = "";
		System.out.println(c);
		
			for(int i=s.length()-1; i >= 0; i--) {
				rev += c[i];
			}
			System.out.println(rev);
		
	}

}
