package com.exception;

class A {
	
	private int age;
	
	public void setAge(int age) {
		if(age < 18 || age > 60) {
			throw new IllegalArgumentException("Inavalid Age");
		}
		else {
			System.out.println(age);
		}
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
}


public class ThrowKeyword {
	
	public static void main(String[] args) {
		A a = new A();
		a.setAge(3);
	}

}
