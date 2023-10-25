package com.Overriding;

class Base{
	public void display() {
		System.out.println("I am from Base class...");
	}
}

class Derived extends Base{
	public void display() {
		System.out.println("I am from Derived class...");
	}
} 

public class Main {

	public static void main(String[] args) {
		Derived b = new Derived();
		b.display();
		
		Base b1 = new Base();
		b1.display();
	}

}
