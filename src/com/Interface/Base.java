package com.Interface;

import com.AbstractClass.Display;

public class Base extends Display implements First,Second{

	@Override
	public void display2() {
		System.out.println("Hello from display2");
		
	}

	@Override
	public void display() {
		System.out.println("Hello from display1");
		
	}

}
