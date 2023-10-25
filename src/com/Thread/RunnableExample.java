package com.Thread;

class RunnableClass1 implements Runnable{

	@Override
	public void run() {
		System.out.println("RunnableClass1");	
	}
	
}

class RunnableClass2 implements Runnable{

	@Override
	public void run() {
		System.out.println("RunnableClass2");	
	}
	
}

public class RunnableExample {

	public static void main(String[] args) {
		RunnableClass1 r1 = new RunnableClass1();
		Thread t1 = new Thread(r1);
		
		RunnableClass2 r2 = new RunnableClass2();
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
