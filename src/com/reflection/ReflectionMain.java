package com.reflection;

class Person{
	public void display() {
		
	}
}

public class ReflectionMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Person p = new Person();
		
		Class c = p.getClass();		
		Person p1 = (Person) c.newInstance();
		p1.display();
	}

}
