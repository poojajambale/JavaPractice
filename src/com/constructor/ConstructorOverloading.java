package com.constructor;

import java.io.PrintStream;

public class ConstructorOverloading {
	int id;
	String name;
	int age;
	
	public ConstructorOverloading(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public ConstructorOverloading(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id+ " , "+name+" , "+age);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading(1, "Pooja", 22);
		ConstructorOverloading c1 = new ConstructorOverloading(2, "Rutuja");
		c.display();
		c1.display();
	}

}
