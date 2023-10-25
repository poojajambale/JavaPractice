package com.Overloading;

class A{
	public void display() {
		System.out.println("Hiii");
	}

	public void display(String str) {
		System.out.println(str);
	}
}

class B {
	public void display() {
		System.out.println("Hello\n hi");
	}

}

public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.display();
		a.display("Pooja");
		
		B b = new B();
		b.display();

	}

}
