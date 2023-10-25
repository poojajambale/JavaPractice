package com.Inheritence;

class Bird{
	public void bird() {
		System.out.println("I can fly");
	}
}

class Peacock extends Bird{
	public void peacock() {
		System.out.println("I am peacock");
	}
}


public class Main {

	public static void main(String[] args) {
		Peacock p = new Peacock();
		p.bird();
		p.peacock();
	}

}
