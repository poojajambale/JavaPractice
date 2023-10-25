package com.exception;

class Aa {
	public int divide(int a, int b) throws Exception {
	    if (b == 0) {
	        throw new Exception("Cannot be divided by zero");
	    }
	 
	    return a / b;
	}
}

public class ThrowsKeyword {

	public static void main(String[] args) {
		Aa a = new Aa();
		
		try {
			a.divide(3, 0);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Cannot be divided by zero");
		}

	}

}
