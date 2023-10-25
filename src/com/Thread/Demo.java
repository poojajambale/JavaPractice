package com.Thread;

class Thread1 extends Thread{
	public void display() {
		System.out.println("From Thread1");
	}
}

class Thread2 extends Thread{
	public void display() {
		System.out.println("From Thread2");
	}
}

public class Demo {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

}
