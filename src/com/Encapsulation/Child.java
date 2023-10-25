package com.Encapsulation;

public class Child {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.setName("Pooja");
		System.out.println(demo.getName());
		
		Demo2 demo2 = new Demo2();
		demo2.setNo(1);
		demo2.setName("Rutuja");
		System.out.println(demo2.getNo());
		System.out.println(demo2.getName());
	}

}
