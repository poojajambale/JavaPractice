package com.stream;

import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age ;
	}
	
	
}

public class FilterExample2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "Pooja", 22));
		list.add(new Student(2, "Shikha", 23));
		list.add(new Student(3, "Rutuja", 23));
		list.add(new Student(4, "Jayashree", 2));
		list.add(new Student(5, "jhdiha", 17));
		
		list.stream().filter(n -> n.age < 18).forEach(n -> System.out.println(n));
	}

}
