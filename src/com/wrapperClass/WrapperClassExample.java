package com.wrapperClass;

public class WrapperClassExample {

	public static void main(String[] args) {
		//Autoboxing
		int a = 4;	
		
		Integer i = a;  //implicitly
		Integer b = Integer.valueOf(a);  //explicitly
		System.out.println(i);
		System.out.println(b);
		
		//Unboxing
		Integer ii = new Integer(2);
		
		int k = ii;  //implicitly
		int j = ii.intValue();  //explicitly
		int m = b;
		System.out.println(k);
		System.out.println(j);
		System.out.println(m);
	}

}
