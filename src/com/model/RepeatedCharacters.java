package com.model;

public class RepeatedCharacters {

	public static void main(String[] args) {
		String s  = "pooja";
		boolean b = false;
		
		for(int i =0; i < s.length(); i++) {
			
			for(int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					System.out.println("Repeated Character: "+ s.charAt(i));
					b = true;
				}
			}
			
			if(b == false) {
				System.out.println("No Repeated Characters");
			}
			
		}

	}

}
