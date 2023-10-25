package com.model;

import java.util.Arrays;

public class StringAscendingOrder {

	public static void main(String[] args) {
		String s = "satyam";
		char[] c = s.toCharArray();
		System.out.println(c);
		Arrays.sort(c);
		System.out.println(c);

	}

}
