package com.exception;

class Base{
	public void display(int a,int b){
		try {
			int res = a/b;
		}
		catch(Exception e) {
			System.out.println("Cannot "+e.getMessage());
		}	
	}
}

public class Main {
	
	public static void main(String[] args) {
		Base b = new Base();
		b.display(10, 0);
		
	}

}
